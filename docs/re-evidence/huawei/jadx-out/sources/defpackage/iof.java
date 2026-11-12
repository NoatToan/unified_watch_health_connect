package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class iof implements Serializable {
    private static final long serialVersionUID = 1552433626961149315L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("medical_conditions")
    private String f37905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("blood_type")
    private int f37906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("medications")
    private String f37907c;

    @SerializedName("allergies")
    private String d;

    @SerializedName("emergency_contacts")
    private ArrayList<b> e;

    @SerializedName("name")
    private String h;

    @SerializedName("address")
    private String i;

    @SerializedName("organ_donor")
    private int j;

    public void c(String str) {
        this.h = str;
    }

    public String i() {
        return this.h;
    }

    public String g() {
        return this.i;
    }

    public void a(String str) {
        this.i = str;
    }

    public int b() {
        return this.f37906b;
    }

    public String e() {
        return this.d;
    }

    public void d(String str) {
        this.d = str;
    }

    public String d() {
        return this.f37907c;
    }

    public void b(String str) {
        this.f37907c = str;
    }

    public void a(int i) {
        this.f37906b = i;
    }

    public int j() {
        return this.j;
    }

    public void b(int i) {
        this.j = i;
    }

    public String c() {
        return this.f37905a;
    }

    public void e(String str) {
        this.f37905a = str;
    }

    public ArrayList<b> a() {
        return this.e;
    }

    public void e(ArrayList<b> arrayList) {
        this.e = arrayList;
    }

    public String toString() {
        return "EmergencyInfo{personalName='" + this.h + "', personalAddress='" + this.i + "', bloodType=" + this.f37906b + ", allergies='" + this.d + "', medications='" + this.f37907c + "', organDonor=" + this.j + ", medicalConditionsAndAdditionalInfo='" + this.f37905a + "', contactList=" + this.e + '}';
    }

    public static class b implements Serializable {
        private static final long serialVersionUID = -1676005475288730958L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("contactIndex")
        private int f37908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("phoneNumber")
        private String f37909c;

        @SerializedName("contactPhoto")
        private byte[] d;

        @SerializedName("contactName")
        private String e;

        public int b() {
            return this.f37908b;
        }

        public void b(int i) {
            this.f37908b = i;
        }

        public String c() {
            return this.e;
        }

        public void b(String str) {
            this.e = str;
        }

        public String a() {
            return this.f37909c;
        }

        public void a(String str) {
            this.f37909c = str;
        }

        public byte[] e() {
            byte[] bArr = this.d;
            if (bArr == null) {
                return new byte[0];
            }
            return (byte[]) bArr.clone();
        }

        public void c(byte[] bArr) {
            if (bArr == null) {
                this.d = new byte[0];
            } else {
                this.d = (byte[]) bArr.clone();
            }
        }

        public String toString() {
            return "Contact{contactIndex=" + this.f37908b + ", contactName='" + this.e + "', phoneNumber='" + this.f37909c + "', contactPhoto=" + Arrays.toString(this.d) + '}';
        }
    }
}
