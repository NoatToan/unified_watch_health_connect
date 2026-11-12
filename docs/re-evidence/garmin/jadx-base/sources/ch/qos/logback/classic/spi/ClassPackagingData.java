package ch.qos.logback.classic.spi;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class ClassPackagingData implements Serializable {
    private static final long serialVersionUID = -804643281218337001L;
    final String codeLocation;
    private final boolean exact;
    final String version;

    public ClassPackagingData(String str, String str2) {
        this.codeLocation = str;
        this.version = str2;
        this.exact = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClassPackagingData classPackagingData = (ClassPackagingData) obj;
        String str = this.codeLocation;
        String str2 = classPackagingData.codeLocation;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        if (this.exact != classPackagingData.exact) {
            return false;
        }
        String str3 = this.version;
        String str4 = classPackagingData.version;
        if (str3 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str3.equals(str4)) {
            return false;
        }
        return true;
    }

    public String getCodeLocation() {
        return this.codeLocation;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.codeLocation;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public boolean isExact() {
        return this.exact;
    }

    public ClassPackagingData(String str, String str2, boolean z14) {
        this.codeLocation = str;
        this.version = str2;
        this.exact = z14;
    }
}
