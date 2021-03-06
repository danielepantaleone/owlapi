/* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2014, The University of Manchester
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
/* Generated By:JavaCC: Do not edit this line. DLSyntaxParserConstants.java */
package org.semanticweb.owlapi.dlsyntax.parser;

interface DLSyntaxParserConstants {

    int EOF = 0;
    int SUBCLASSOF = 4;
    int EQUIVALENTTO = 5;
    int NEQ = 6;
    int COMPOSE = 7;
    int DOT = 8;
    int INVERSE = 9;
    int OPENPAR = 10;
    int CLOSEPAR = 11;
    int OPENSQPAR = 12;
    int CLOSESQPAR = 13;
    int OPENBRACE = 14;
    int CLOSEBRACE = 15;
    int COLON = 16;
    int AND = 17;
    int OR = 18;
    int NOT = 19;
    int SOME = 20;
    int ALL = 21;
    int MIN = 22;
    int MAX = 23;
    int EXACT = 24;
    int IN = 25;
    int TRANSITIVEROLES = 26;
    int INT = 27;
    int DOUBLE = 28;
    int ID = 29;
    int DEFAULT = 0;
    String[] tokenImage = { "<EOF>", "\" \"", "\"\\r\"", "\"\\t\"",
            "<SUBCLASSOF>", "<EQUIVALENTTO>", "<NEQ>", "<COMPOSE>", "\".\"",
            "<INVERSE>", "\"(\"", "\")\"", "\"[\"", "\"]\"", "\"{\"", "\"}\"",
            "\":\"", "<AND>", "<OR>", "<NOT>", "<SOME>", "<ALL>", "<MIN>",
            "<MAX>", "<EXACT>", "<IN>", "<TRANSITIVEROLES>", "<INT>",
            "<DOUBLE>", "<ID>", "\"\\n\"", "\",\"", };
}
