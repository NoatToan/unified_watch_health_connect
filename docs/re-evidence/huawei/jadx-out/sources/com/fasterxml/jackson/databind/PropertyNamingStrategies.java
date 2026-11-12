package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import defpackage.acj;
import defpackage.aco;
import defpackage.acp;
import java.io.Serializable;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes21.dex */
public abstract class PropertyNamingStrategies implements Serializable {
    private static final long serialVersionUID = 2;
    public static final PropertyNamingStrategy LOWER_CAMEL_CASE = new a();
    public static final PropertyNamingStrategy UPPER_CAMEL_CASE = new j();
    public static final PropertyNamingStrategy SNAKE_CASE = new e();
    public static final PropertyNamingStrategy LOWER_CASE = new b();
    public static final PropertyNamingStrategy KEBAB_CASE = new c();
    public static final PropertyNamingStrategy LOWER_DOT_CASE = new d();

    public static class a extends NamingBase {
        private static final long serialVersionUID = 2;

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategies.NamingBase
        public String translate(String str) {
            return str;
        }
    }

    public static abstract class NamingBase extends PropertyNamingStrategy {
        private static final long serialVersionUID = 2;

        public abstract String translate(String str);

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public String nameForField(MapperConfig<?> mapperConfig, acj acjVar, String str) {
            return translate(str);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public String nameForGetterMethod(MapperConfig<?> mapperConfig, aco acoVar, String str) {
            return translate(str);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public String nameForSetterMethod(MapperConfig<?> mapperConfig, aco acoVar, String str) {
            return translate(str);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public String nameForConstructorParameter(MapperConfig<?> mapperConfig, acp acpVar, String str) {
            return translate(str);
        }

        protected String translateLowerCaseWithSeparator(String str, char c2) {
            int length;
            if (str == null || (length = str.length()) == 0) {
                return str;
            }
            StringBuilder sb = new StringBuilder((length >> 1) + length);
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                char lowerCase = Character.toLowerCase(cCharAt);
                if (lowerCase == cCharAt) {
                    if (i > 1) {
                        sb.insert(sb.length() - 1, c2);
                    }
                    i = 0;
                } else {
                    if (i == 0 && i2 > 0) {
                        sb.append(c2);
                    }
                    i++;
                }
                sb.append(lowerCase);
            }
            return sb.toString();
        }
    }

    public static class e extends NamingBase {
        private static final long serialVersionUID = 2;

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategies.NamingBase
        public String translate(String str) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            StringBuilder sb = new StringBuilder(length * 2);
            int i = 0;
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (i2 > 0 || cCharAt != '_') {
                    if (Character.isUpperCase(cCharAt)) {
                        if (!z && i > 0 && sb.charAt(i - 1) != '_') {
                            sb.append('_');
                            i++;
                        }
                        cCharAt = Character.toLowerCase(cCharAt);
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(cCharAt);
                    i++;
                }
            }
            return i > 0 ? sb.toString() : str;
        }
    }

    public static class j extends NamingBase {
        private static final long serialVersionUID = 2;

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategies.NamingBase
        public String translate(String str) {
            char cCharAt;
            char upperCase;
            if (str == null || str.isEmpty() || cCharAt == (upperCase = Character.toUpperCase((cCharAt = str.charAt(0))))) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(0, upperCase);
            return sb.toString();
        }
    }

    public static class b extends NamingBase {
        private static final long serialVersionUID = 2;

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategies.NamingBase
        public String translate(String str) {
            return str.toLowerCase();
        }
    }

    public static class c extends NamingBase {
        private static final long serialVersionUID = 2;

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategies.NamingBase
        public String translate(String str) {
            return translateLowerCaseWithSeparator(str, '-');
        }
    }

    public static class d extends NamingBase {
        private static final long serialVersionUID = 2;

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategies.NamingBase
        public String translate(String str) {
            return translateLowerCaseWithSeparator(str, FilenameUtils.EXTENSION_SEPARATOR);
        }
    }
}
