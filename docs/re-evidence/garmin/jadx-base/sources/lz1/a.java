package lz1;

import c22.l3;
import java.text.DecimalFormat;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Llz1/a;", "", "<init>", "()V", "a", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2198a f115397a = new C2198a(null);

    /* JADX INFO: renamed from: lz1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llz1/a$a;", "", "<init>", "()V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2198a {
        public /* synthetic */ C2198a(j jVar) {
            this();
        }

        public static String a(double d14) {
            bg0.a.f17827a.getClass();
            if (bg0.a.C0255a.e()) {
                l3.f23124b.getClass();
                String str = new DecimalFormat("0.00").format(d14 / 1000.0d);
                str.getClass();
                return str;
            }
            l3.f23124b.getClass();
            String str2 = new DecimalFormat("0.00").format(d14 / 1609.344d);
            str2.getClass();
            return str2;
        }

        private C2198a() {
        }
    }
}
