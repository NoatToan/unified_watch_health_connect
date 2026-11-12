package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ri8 extends bbq {

    public final class b extends bbq.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c[] f32563a;

        public final class a extends bbq.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f32565a;

            public a() {
            }

            @Override // bbq.e
            public boolean a() {
                return this.f32565a < b.this.f32563a.length;
            }

            @Override // bbq.e
            public bbq.d b() throws IOException {
                c[] cVarArr = b.this.f32563a;
                int i = this.f32565a;
                this.f32565a = i + 1;
                c cVar = cVarArr[i];
                FileInputStream fileInputStream = new FileInputStream(cVar.c);
                try {
                    return new bbq.f(cVar, fileInputStream);
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x00ee */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(defpackage.bbq r19) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 293
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ri8.b.<init>(ri8, bbq):void");
        }

        @Override // bbq.g
        public bbq.c a() throws IOException {
            return new bbq.c(this.f32563a);
        }

        @Override // bbq.g
        public bbq.e b() throws IOException {
            return new a();
        }
    }

    public static final class c extends bbq.b {
        public final File c;

        public c(String str, String str2, File file) {
            super(str, str2);
            this.c = file;
        }
    }

    public ri8(Context context, String str) {
        super(context, str);
    }

    @Override // defpackage.bbq
    public bbq.g t(byte b2) throws IOException {
        return new b(this);
    }
}
