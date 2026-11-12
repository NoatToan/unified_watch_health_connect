package vz;

import com.github.mikephil.charting.data.PieDataSet;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
public interface b<T> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvz/b$a;", "", "<init>", "()V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f180865a = 0;

        static {
            new a();
        }

        private a() {
        }
    }

    static {
        int i14 = a.f180865a;
    }

    PieDataSet a(T t7);

    default CharSequence b(T t7) {
        return "";
    }

    void c(Object obj);

    CharSequence d(T t7);
}
