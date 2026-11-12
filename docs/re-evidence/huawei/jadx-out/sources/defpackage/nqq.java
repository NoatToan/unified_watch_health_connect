package defpackage;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.health.messagecenter.model.CommonUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nqq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("version")
    private int f43469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("extraProcessTypes")
    private List<b> f43470b;

    @SerializedName("dictTypes")
    private List<e> d;

    public List<e> b() {
        return this.d;
    }

    public List<b> d() {
        return this.f43470b;
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("processUrl")
        private String f43471a;

        @SerializedName("typeId")
        private int d;

        public int c() {
            return this.d;
        }

        public String d() {
            return this.f43471a;
        }

        public String toString() {
            return "ExtraProcessType{typeId=" + this.d + ", processUrl='" + this.f43471a + "'}";
        }
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("typeId")
        private int f43472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("name")
        private String f43473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("fields")
        private List<a> f43474c;

        @SerializedName("syncType")
        private int d;

        public int e() {
            return this.d;
        }

        public int g() {
            return this.f43472a;
        }

        public String d() {
            return this.f43473b;
        }

        public List<a> b() {
            return this.f43474c;
        }

        public List<Integer> c() {
            HashSet hashSet = new HashSet();
            for (a aVar : b()) {
                if (aVar.b() != 0) {
                    hashSet.add(Integer.valueOf(aVar.b()));
                } else {
                    hashSet.add(Integer.valueOf(aVar.a()));
                }
            }
            return new ArrayList(hashSet);
        }

        public List<Integer> a() {
            HashSet hashSet = new HashSet();
            for (a aVar : b()) {
                if (!TextUtils.isEmpty(aVar.e())) {
                    Iterator<a.b> it = aVar.i().iterator();
                    while (it.hasNext()) {
                        hashSet.add(Integer.valueOf(it.next().d()));
                    }
                }
            }
            return new ArrayList(hashSet);
        }

        public int d(String str) {
            for (a aVar : b()) {
                if (!TextUtils.isEmpty(aVar.e()) && aVar.e().equals(str)) {
                    return TextUtils.isEmpty(aVar.c()) ? aVar.a() : aVar.b();
                }
            }
            return -1;
        }

        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @SerializedName(CommonUtil.PARAM_HEALTH_TYPE)
            int f43475a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @SerializedName("mappingName")
            String f43476b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @SerializedName("isMetaData")
            boolean f43477c;

            @SerializedName("format")
            String d;

            @SerializedName("mappingId")
            int e;

            @SerializedName("requestId")
            int f;

            @SerializedName("metaName")
            String g;

            @SerializedName("statMappings")
            List<b> h;

            @SerializedName("name")
            String i;

            public String d() {
                return this.g;
            }

            public boolean j() {
                return this.f43477c;
            }

            public List<b> i() {
                return this.h;
            }

            public int b() {
                return this.e;
            }

            public String c() {
                return this.f43476b;
            }

            public int a() {
                return this.f43475a;
            }

            public String e() {
                return this.i;
            }

            public int f() {
                return this.f;
            }

            public String toString() {
                return "Field{healthType=" + this.f43475a + ", name='" + this.i + "', format='" + this.d + "', isMetaData=" + this.f43477c + ", mappingId=" + this.e + ", mappingName='" + this.f43476b + "', statMappings=" + this.h + ", metaName='" + this.g + "', requestId=" + this.f + '}';
            }

            public class b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                @SerializedName("statPolicy")
                String f43478a;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                @SerializedName("statName")
                String f43479c;

                @SerializedName("statType")
                int e;

                public String a() {
                    return this.f43478a;
                }

                public int d() {
                    return this.e;
                }

                public String b() {
                    return this.f43479c;
                }

                public String toString() {
                    return "StatMapping{statName='" + this.f43479c + "', statType=" + this.e + ", statPolicy='" + this.f43478a + "'}";
                }
            }
        }

        public String toString() {
            return "Config{fields=" + this.f43474c + ", typeId=" + this.f43472a + ", name='" + this.f43473b + "', syncType=" + this.d + '}';
        }
    }

    public String toString() {
        return "DictConfig{mVersion=" + this.f43469a + ", mExtraProcessTypes=" + this.f43470b + ", mDictTypes=" + this.d + '}';
    }
}
