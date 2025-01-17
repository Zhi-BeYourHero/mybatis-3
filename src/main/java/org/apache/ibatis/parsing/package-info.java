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
 * Parsing utils.
 * 基础支持层 - 解析器模块
 * 主要提供两个功能
 * 1. 对XPath进行封装，为Mybatis初始化时解析配置文件mybatis-config.xml及映射配置文件提供支持
 * 2. 为动态处理SQL语句中的占位符提供支持
 */
package org.apache.ibatis.parsing;
