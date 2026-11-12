package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class nug implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("resultCode")
    private String f43745b;

    @SerializedName("customization")
    private e e;

    public static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("taskId")
        private String f43746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("isCustomized")
        private boolean f43747c;

        public boolean c() {
            return this.f43747c;
        }

        public String e() {
            return this.f43746b;
        }

        public String toString() {
            return "Customization{isCustomized=" + this.f43747c + ", taskId='" + this.f43746b + "'}";
        }
    }

    public e c() {
        return this.e;
    }

    public String toString() {
        return "EnterpriseResponseHealthKitInfo{resultCode='" + this.f43745b + "', customization=" + this.e + '}';
    }
}
