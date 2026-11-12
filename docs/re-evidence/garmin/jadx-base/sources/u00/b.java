package u00;

import com.garmin.android.apps.connectmobile.R;
import oe2.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu00/b;", "", "T", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "formatter_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f167338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c<T> f167339b;

    public b(l22.b bVar, c<T> cVar) {
        bVar.getClass();
        this.f167338a = bVar;
        this.f167339b = cVar;
    }

    public static /* synthetic */ String c(b bVar, Object obj, int i14, int i15) {
        if ((i15 & 2) != 0) {
            i14 = 9;
        }
        return bVar.b(i14, obj, (i15 & 4) != 0);
    }

    public static boolean f(int i14) {
        return f.H(i14, 4) || f.H(i14, 32);
    }

    public static boolean g(int i14) {
        return (f.H(i14, 2) || f.H(i14, 4) || f.H(i14, 32)) ? false : true;
    }

    public abstract String a(int i14, Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    public String b(int i14, Object obj, boolean z14) {
        c<T> cVar;
        String strE = e(obj);
        l22.b bVar = this.f167338a;
        if (obj != 0 && (cVar = this.f167339b) != null && cVar.a(obj)) {
            String strA = a(i14, obj);
            return (z14 && strE != null && f.H(i14, 32)) ? bVar.a(R.string.string_comma_string_pattern, strE, strA) : strA;
        }
        if (f.H(i14, 8)) {
            return d(i14);
        }
        String string = bVar.getString(R.string.no_data_label);
        if (!z14 || strE == null) {
            return null;
        }
        if (f.H(i14, 32)) {
            return bVar.a(R.string.string_comma_string_pattern, strE, string);
        }
        if (f.H(i14, 4)) {
            return string;
        }
        return null;
    }

    public String d(int i14) {
        return null;
    }

    public String e(T t7) {
        return null;
    }

    public /* synthetic */ b(l22.b bVar, c cVar, int i14, j jVar) {
        this(bVar, (i14 & 2) != 0 ? null : cVar);
    }
}
