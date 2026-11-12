package c92;

import com.google.firebase.messaging.Constants;
import i3.df;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u000bB!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lc92/b;", "", "Li3/df;", "direction", "Lc92/a;", "action", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Li3/df;Lc92/a;Ljava/lang/String;)V", "b", "a", "Lc92/b$a;", "Lc92/b$b;", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final df f26054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c92.a f26055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f26056c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc92/b$a;", "Lc92/b;", "Lc92/a;", "dismissAction", "", "dismissLabel", "<init>", "(Lc92/a;Ljava/lang/String;)V", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c92.a aVar, String str) {
            super(df.EndToStart, aVar, str, null);
            aVar.getClass();
            str.getClass();
        }
    }

    /* JADX INFO: renamed from: c92.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc92/b$b;", "Lc92/b;", "Lc92/a;", "dismissAction", "", "dismissLabel", "<init>", "(Lc92/a;Ljava/lang/String;)V", "components_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0397b extends b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0397b(c92.a aVar, String str) {
            super(df.StartToEnd, aVar, str, null);
            aVar.getClass();
            str.getClass();
        }
    }

    private b(df dfVar, c92.a aVar, String str) {
        this.f26054a = dfVar;
        this.f26055b = aVar;
        this.f26056c = str;
    }

    public /* synthetic */ b(df dfVar, c92.a aVar, String str, j jVar) {
        this(dfVar, aVar, str);
    }
}
