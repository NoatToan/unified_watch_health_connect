package defpackage;

import android.view.View;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class z5l {

    public static class a implements bua<o4h<Throwable>, o5h<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f40920b;
        public int c = 0;

        /* JADX INFO: renamed from: z5l$a$a, reason: collision with other inner class name */
        public class C1162a implements bua<Throwable, o5h<?>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f40921a;

            public C1162a(Object obj) {
                this.f40921a = obj;
            }

            @Override // defpackage.bua
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public o5h<?> apply(Throwable th) {
                synchronized (this.f40921a) {
                    try {
                        a aVar = a.this;
                        int i = aVar.c + 1;
                        aVar.c = i;
                        if (i <= a.this.f40920b) {
                            return o4h.b0(a.this.f40919a, TimeUnit.MILLISECONDS);
                        }
                        return o4h.p(th);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public a(int i, int i2) {
            this.f40919a = i;
            this.f40920b = i2;
        }

        @Override // defpackage.bua
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public o5h<?> apply(o4h<Throwable> o4hVar) {
            return o4hVar.r(new C1162a(this));
        }
    }

    public static jz6 a(View view, bg4<Object> bg4Var) {
        return c6l.a(view).X(500L, TimeUnit.MILLISECONDS).H(ua1.c()).N(bg4Var);
    }

    public static jz6 b(View view, bg4<Object> bg4Var) {
        return c6l.a(view).X(VibrateModeProgressBar.sLongToLong, TimeUnit.MILLISECONDS).H(ua1.c()).N(bg4Var);
    }
}
