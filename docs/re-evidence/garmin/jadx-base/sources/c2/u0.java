package c2;

import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@o13.e
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u000fBa\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000e\u0082\u0001\u0001\u0010¨\u0006\u0011"}, d2 = {"Lc2/u0;", "", "Lc2/u0$a;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "minLinesToShowCollapse", "minCrossAxisSizeToShowCollapse", "Lkotlin/Function1;", "Lc2/w0;", "Lkotlin/Function0;", "", "seeMoreGetter", "collapseGetter", "<init>", "(Lc2/u0$a;IILe23/l;Le23/l;)V", "a", "Lc2/b1;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f22886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.l<w0, e23.p<p3.m, Integer, Unit>> f22889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.l<w0, e23.p<p3.m, Integer, Unit>> f22890e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc2/u0$a;", "", "<init>", "(Ljava/lang/String;I)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum a {
        Visible,
        Clip,
        ExpandIndicator,
        ExpandOrCollapseIndicator
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22896a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.ExpandIndicator.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ExpandOrCollapseIndicator.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f22896a = iArr;
        }
    }

    public /* synthetic */ u0(a aVar, int i14, int i15, e23.l lVar, e23.l lVar2, int i16, p005kotlin.jvm.internal.j jVar) {
        this(aVar, (i16 & 2) != 0 ? 0 : i14, (i16 & 4) != 0 ? 0 : i15, (i16 & 8) != 0 ? null : lVar, (i16 & 16) != 0 ? null : lVar2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private u0(a aVar, int i14, int i15, e23.l<? super w0, ? extends e23.p<? super p3.m, ? super Integer, Unit>> lVar, e23.l<? super w0, ? extends e23.p<? super p3.m, ? super Integer, Unit>> lVar2) {
        this.f22886a = aVar;
        this.f22887b = i14;
        this.f22888c = i15;
        this.f22889d = lVar;
        this.f22890e = lVar2;
    }

    public /* synthetic */ u0(a aVar, int i14, int i15, e23.l lVar, e23.l lVar2, p005kotlin.jvm.internal.j jVar) {
        this(aVar, i14, i15, lVar, lVar2);
    }
}
