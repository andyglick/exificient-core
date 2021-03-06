/*
 * Copyright (c) 2007-2016 Siemens AG
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * 
 */

package com.siemens.ct.exi;

import javax.xml.XMLConstants;

/**
 * This class contains useful constants to the entire EXI project
 * 
 * @author Daniel.Peintner.EXT@siemens.com
 * @author Joerg.Heuer@siemens.com
 * 
 * @version 0.9.7-SNAPSHOT
 */

public interface Constants {
	
	/**
	 * Version string to identify library (e.g., in EXIficientGUI)
	 */
	public static final String VERSION = "0.9.6-SNAPSHOT";

	/**
	 * <p>
	 * W3C EXI Namespace URI
	 * </p>
	 * 
	 * <p>
	 * Defined to be "<code>http://www.w3.org/2009/exi</code>".
	 */
	public static final String W3C_EXI_NS_URI = "http://www.w3.org/2009/exi";

	/**
	 * <p>
	 * W3C EXI local-name for datatype xsd:base64Binary
	 * </p>
	 */
	public static final String W3C_EXI_LN_BASE64BINARY = "base64Binary";
	
	/**
	 * <p>
	 * W3C EXI local-name for datatype xsd:hexBinary
	 * </p>
	 */
	public static final String W3C_EXI_LN_HEXBINARY = "hexBinary";
	
	/**
	 * <p>
	 * W3C EXI local-name for datatype xsd:boolean
	 * </p>
	 */
	public static final String W3C_EXI_LN_BOOLEAN = "boolean";
	
	/**
	 * <p>
	 * W3C EXI local-name for datatype xsd:dateTime
	 * </p>
	 */
	public static final String W3C_EXI_LN_DATETIME = "dateTime";
	
	/**
	 * <p>
	 * W3C EXI local-name for datatype xsd:time
	 * </p>
	 */
	public static final String W3C_EXI_LN_TIME = "time";
	
	/**
	 * <p>
	 * W3C EXI local-name for datatype xsd:date
	 * </p>
	 */
	public static final String W3C_EXI_LN_DATE = "date";
	
	/**
	 * <p>
	 * W3C EXI local-name for datatype xsd:gYearMonth
	 * </p>
	 */
	public static final String W3C_EXI_LN_GYEARMONTH = "gYearMonth";
	
	/**
	 * <p>
	 * W3C EXI local-name for datatype xsd:gYear
	 * </p>
	 */
	public static final String W3C_EXI_LN_GYEAR = "gYear";
	
	/**
	 * <p>
	 * W3C EXI local-name for datatype xsd:gMonthDay
	 * </p>
	 */
	public static final String W3C_EXI_LN_GMONTHDAY = "gMonthDay";
	
	/**
	 * <p>
	 * W3C EXI local-name for datatype xsd:gDay
	 * </p>
	 */
	public static final String W3C_EXI_LN_GDAY = "gDay";
	
	/**
	 * <p>
	 * W3C EXI local-name for datatype xsd:gMonth
	 * </p>
	 */
	public static final String W3C_EXI_LN_GMONTH = "gMonth";
	
	/**
	 * <p>
	 * W3C EXI local-name for datatype xsd:decimal
	 * </p>
	 */
	public static final String W3C_EXI_LN_DECIMAL = "decimal";
	
	/**
	 * <p>
	 * W3C EXI local-name for datatype xsd:float and xsd:double
	 * </p>
	 */
	public static final String W3C_EXI_LN_DOUBLE = "double";
	
	/**
	 * <p>
	 * W3C EXI local-name for datatype xsd:integer
	 * </p>
	 */
	public static final String W3C_EXI_LN_INTEGER = "integer";
	
	/**
	 * <p>
	 * W3C EXI local-name for datatype xsd:string, xsd:anySimpleType and all types derived by union
	 * </p>
	 */
	public static final String W3C_EXI_LN_STRING = "string";
	
	
	/**
	 * XML Reader feature
	 */
	public static final String W3C_EXI_FEATURE_BODY_ONLY = "http://www.w3.org/exi/features/exi-body-only";

	/**
	 * Initial Entries in String Table Partitions
	 */
	/* "", empty string */
	public static final String[] PREFIXES_EMPTY = { "" };
	public static final String[] LOCAL_NAMES_EMPTY = {};
	/* "http://www.w3.org/XML/1998/namespace" */
	public static String[] PREFIXES_XML = { "xml" };
	public static String[] LOCAL_NAMES_XML = { "base", "id", "lang", "space" };
	/* "http://www.w3.org/2001/XMLSchema-instance", xsi */
	public static String[] PREFIXES_XSI = { "xsi" };
	public static String[] LOCAL_NAMES_XSI = { "nil", "type" };
	/* "http://www.w3.org/2001/XMLSchema", xsd */
	public static String[] PREFIXES_XSD = {};
	public static String[] LOCAL_NAMES_XSD = { "ENTITIES", "ENTITY", "ID",
			"IDREF", "IDREFS", "NCName", "NMTOKEN", "NMTOKENS", "NOTATION",
			"Name", "QName", "anySimpleType", "anyType", "anyURI",
			"base64Binary", "boolean", "byte", "date", "dateTime", "decimal",
			"double", "duration", "float", "gDay", "gMonth", "gMonthDay",
			"gYear", "gYearMonth", "hexBinary", "int", "integer", "language",
			"long", "negativeInteger", "nonNegativeInteger",
			"nonPositiveInteger", "normalizedString", "positiveInteger",
			"short", "string", "time", "token", "unsignedByte", "unsignedInt",
			"unsignedLong", "unsignedShort" };

	/**
	 * 
	 */
	public static final String EMPTY_STRING = "";
	// public static final StringValue EMPTY_STRING_VALUE = new
	// StringValue(Constants.EMPTY_STRING);

	public static final String XSI_SCHEMA_LOCATION = "schemaLocation";
	public static final String XSI_NONAMESPACE_SCHEMA_LOCATION = "noNamespaceSchemaLocation";

	public static final String XML_NS_PREFIX = XMLConstants.XML_NS_PREFIX; // "xml"
	public static final String XML_NULL_NS_URI = XMLConstants.NULL_NS_URI; // ""
	public static final String XML_DEFAULT_NS_PREFIX = XMLConstants.DEFAULT_NS_PREFIX; // ""
	public static final String XML_NS_ATTRIBUTE_NS_URI = XMLConstants.XMLNS_ATTRIBUTE_NS_URI; // "http://www.w3.org/2000/xmlns/"
	public static final String XML_NS_ATTRIBUTE = XMLConstants.XMLNS_ATTRIBUTE; // "xmlns"
	public static final String XML_NS_URI = XMLConstants.XML_NS_URI; // "http://www.w3.org/XML/1998/namespace"
	public static final String XML_SCHEMA_INSTANCE_NS_URI = XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI; // "http://www.w3.org/2001/XMLSchema-instance"
	public static final String XML_SCHEMA_NS_URI = XMLConstants.W3C_XML_SCHEMA_NS_URI; // "http://www.w3.org/2001/XMLSchema"
	
	public static final String XSI_PFX = "xsi";
	public static final String XSI_TYPE = "type";
	public static final String XSI_NIL = "nil";

	public static final String COLON = ":";

	public static final String XSD_LIST_DELIM = " ";
	public static final char XSD_LIST_DELIM_CHAR = ' ';
	public static final char[] XSD_LIST_DELIM_CHAR_ARRAY = {' '};

	// public static final String CDATA_START = "<![CDATA[";
	// public static final char[] CDATA_START_ARRAY = CDATA_START.toCharArray();
	// public static final String CDATA_END = "]]>";
	// public static final char[] CDATA_END_ARRAY = CDATA_END.toCharArray();

	public static final String XSD_ANY_TYPE = "anyType";

	public static final String XSD_BOOLEAN_TRUE = "true";
	public static final String XSD_BOOLEAN_1 = "1";
	public static final String XSD_BOOLEAN_FALSE = "false";
	public static final String XSD_BOOLEAN_0 = "0";

	public static final char[] XSD_BOOLEAN_TRUE_ARRAY = XSD_BOOLEAN_TRUE
			.toCharArray();
	public static final char[] XSD_BOOLEAN_1_ARRAY = XSD_BOOLEAN_1
			.toCharArray();
	public static final char[] XSD_BOOLEAN_FALSE_ARRAY = XSD_BOOLEAN_FALSE
			.toCharArray();
	public static final char[] XSD_BOOLEAN_0_ARRAY = XSD_BOOLEAN_0
			.toCharArray();

	public static final String DECODED_BOOLEAN_TRUE = XSD_BOOLEAN_TRUE;
	public static final String DECODED_BOOLEAN_FALSE = XSD_BOOLEAN_FALSE;
	public static final char[] DECODED_BOOLEAN_TRUE_ARRAY = DECODED_BOOLEAN_TRUE
			.toCharArray();
	public static final char[] DECODED_BOOLEAN_FALSE_ARRAY = DECODED_BOOLEAN_FALSE
			.toCharArray();

	public static final int NOT_FOUND = -1;

	/*
	 * Block & Channel settings Maximal Number of Values (per Block / Channel)
	 */
	public static final int MAX_NUMBER_OF_VALUES = 100;
	public static final int DEFAULT_BLOCK_SIZE = 1000000;

	/*
	 * StringTable settings
	 */
	public static final int DEFAULT_VALUE_MAX_LENGTH = -1; // unbounded
	public static final int DEFAULT_VALUE_PARTITON_CAPACITY = -1; // unbounded

	/*
	 * Float & Double Values
	 */
	public static final String FLOAT_INFINITY = "INF";
	public static final String FLOAT_MINUS_INFINITY = "-INF";
	public static final String FLOAT_NOT_A_NUMBER = "NaN";

	public static final char[] FLOAT_INFINITY_CHARARRAY = FLOAT_INFINITY
			.toCharArray();
	public static final char[] FLOAT_MINUS_INFINITY_CHARARRAY = FLOAT_MINUS_INFINITY
			.toCharArray();
	public static final char[] FLOAT_NOT_A_NUMBER_CHARARRAY = FLOAT_NOT_A_NUMBER
			.toCharArray();

	/* -(2^14) == -16384 */
	public static final int FLOAT_SPECIAL_VALUES = -16384;
	public static final int FLOAT_MANTISSA_INFINITY = 1;
	public static final int FLOAT_MANTISSA_MINUS_INFINITY = -1;
	public static final int FLOAT_MANTISSA_NOT_A_NUMBER = 0;

	/* -(2^14-1) == -16383 */
	public static final long FLOAT_EXPONENT_MIN_RANGE = -16383;
	/* 2^14-1 == 16383 */
	public static final long FLOAT_EXPONENT_MAX_RANGE = 16383;
	/* -(2^63) == -9223372036854775808L */
	public static final long FLOAT_MANTISSA_MIN_RANGE = -9223372036854775808L;
	/* 2^63-1 == 9223372036854775807L */
	public static final long FLOAT_MANTISSA_MAX_RANGE = 9223372036854775807L;

}
