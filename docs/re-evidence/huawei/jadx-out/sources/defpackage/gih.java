package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.networkclient.IRequest;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gih implements IRequest {

    @SerializedName("list")
    private List<a> d;

    private gih(b bVar) {
        this.d = bVar.f35187b;
    }

    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("courseBelongType")
        private Integer f35185c;

        @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
        private String d;

        @SerializedName("version")
        private String e;

        private a(d dVar) {
            this.d = dVar.e;
            this.e = dVar.f35186a;
            this.f35185c = dVar.d;
        }

        public static final class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f35186a;
            private Integer d;
            private String e;

            public d b(String str) {
                this.e = str;
                return this;
            }

            public d d(String str) {
                this.f35186a = str;
                return this;
            }

            public d a(Integer num) {
                this.d = num;
                return this;
            }

            public a b() {
                return new a(this);
            }
        }
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.o();
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<a> f35187b;

        public b b(List<a> list) {
            this.f35187b = list;
            return this;
        }

        public gih e() {
            return new gih(this);
        }
    }
}
