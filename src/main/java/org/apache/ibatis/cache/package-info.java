/*
 *    Copyright 2009-2021 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
/**
 * Base package for caching stuff.
 * 在优化系统性能时， 优化数据库性能是非常重要的一个环节，而添加缓存则是
 * 优化数据库时最有效的手段之一。正确、合理地使用缓存可以将一部分数据库请求
 * 拦截在这一层。
 *
 * MyBatis提供了一级缓存和二级缓存，而这两级缓存都是依赖于基础支持层中的缓存模块实现的。
 * 需要注意的是MyBatis自带的这两级缓存与MyBatis以及整个应用都是运行在同一个JVM中的，
 * 共享同一块堆内存。
 * 如果这两级缓存中的数据量较大，则可能影响系统中其他功能的运行， 所以当需要缓存大量数据时，
 * 优先考虑使用Redis、Memcached等缓存产品
 * */
package org.apache.ibatis.cache;
