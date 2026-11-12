package defpackage;

import com.huawei.ads.adsrec.db.table.AdEventRecord;

/* JADX INFO: loaded from: classes4.dex */
public class axj {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdEventRecord f747c;

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f750c;
        private String d;
        private Long e;
        private String f;
        private String g;
        private Integer i;
        private Long j;

        public d j(String str) {
            this.f750c = str;
            return this;
        }

        public d c(String str) {
            this.f749b = str;
            return this;
        }

        public d a(Long l) {
            this.e = l;
            return this;
        }

        public d e(String str) {
            this.f748a = str;
            return this;
        }

        public d a(Integer num) {
            this.i = num;
            return this;
        }

        public d a(String str) {
            this.f = str;
            return this;
        }

        public d c(Long l) {
            this.j = l;
            return this;
        }

        public d b(String str) {
            this.d = str;
            return this;
        }

        public d d(String str) {
            this.g = str;
            return this;
        }

        public axj d() {
            AdEventRecord adEventRecord = new AdEventRecord();
            adEventRecord.d(this.f748a);
            adEventRecord.j(this.f750c);
            adEventRecord.e(this.d);
            adEventRecord.a(this.f749b);
            Long l = this.e;
            if (l != null) {
                adEventRecord.b(l.longValue());
            }
            Integer num = this.i;
            if (num != null) {
                adEventRecord.b(num.intValue());
            }
            adEventRecord.c(this.f);
            Long l2 = this.j;
            if (l2 != null) {
                adEventRecord.a(l2.longValue());
            }
            String str = this.g;
            if (str != null) {
                adEventRecord.b(str);
            }
            return new axj(adEventRecord);
        }
    }

    public String toString() {
        return "AdAffair{" + this.f747c + '}';
    }

    public AdEventRecord a() {
        return this.f747c;
    }

    private axj(AdEventRecord adEventRecord) {
        this.f747c = adEventRecord;
    }
}
