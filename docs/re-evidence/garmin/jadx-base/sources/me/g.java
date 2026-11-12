package me;

import androidx.window.core.WindowStrictModeException;
import com.nimbusds.jose.HeaderParameterNames;
import lc.u0;
import p005kotlin.Metadata;
import p13.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B/\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lme/g;", "", "T", "Lme/i;", "value", "", HeaderParameterNames.AUTHENTICATION_TAG, "message", "Lme/h;", "logger", "Lme/k;", "verificationMode", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lme/h;Lme/k;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g<T> extends i<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f117962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f117964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f117965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f117966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WindowStrictModeException f117967g;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f117968a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.QUIET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f117968a = iArr;
        }
    }

    public g(T t7, String str, String str2, h hVar, k kVar) {
        t7.getClass();
        str.getClass();
        str2.getClass();
        hVar.getClass();
        kVar.getClass();
        this.f117962b = t7;
        this.f117963c = str;
        this.f117964d = str2;
        this.f117965e = hVar;
        this.f117966f = kVar;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(str2 + " value: " + t7);
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        stackTrace.getClass();
        windowStrictModeException.setStackTrace((StackTraceElement[]) u.A(2, stackTrace).toArray(new StackTraceElement[0]));
        this.f117967g = windowStrictModeException;
    }

    @Override // me.i
    public final T a() throws WindowStrictModeException {
        int i14 = a.f117968a[this.f117966f.ordinal()];
        if (i14 == 1) {
            throw this.f117967g;
        }
        if (i14 != 2) {
            if (i14 == 3) {
                return null;
            }
            u0.r();
            return null;
        }
        T t7 = this.f117962b;
        t7.getClass();
        String str = this.f117964d;
        str.getClass();
        this.f117965e.a(this.f117963c, str + " value: " + t7);
        return null;
    }

    @Override // me.i
    public final i b(e23.l lVar, String str) {
        return this;
    }
}
