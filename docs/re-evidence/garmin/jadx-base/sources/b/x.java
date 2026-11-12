package b;

import android.content.res.Resources;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lb/x;", "", "", "lightScrim", "darkScrim", "nightMode", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "detectDarkMode", "<init>", "(IIILe23/l;)V", "a", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f13833e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<Resources, Boolean> f13837d;

    /* JADX WARN: Multi-variable type inference failed */
    private x(int i14, int i15, int i16, e23.l<? super Resources, Boolean> lVar) {
        this.f13834a = i14;
        this.f13835b = i15;
        this.f13836c = i16;
        this.f13837d = lVar;
    }

    public final int a(boolean z14) {
        if (this.f13836c == 0) {
            return 0;
        }
        return z14 ? this.f13835b : this.f13834a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb/x$a;", "", "<init>", "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ x(int i14, int i15, int i16, e23.l lVar, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, i16, lVar);
    }
}
