package o2;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.messaging.Constants;
import ds.e0;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lo2/e;", "Lo2/b;", "", Action.KEY_ATTRIBUTE, "", Constants.ScionAnalytics.PARAM_LABEL, "", "leadingIcon", "Lkotlin/Function1;", "Lo2/h;", "", "onClick", "<init>", "(Ljava/lang/Object;Ljava/lang/String;ILe23/l;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f128627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l<h, Unit> f128628d;

    /* JADX WARN: Multi-variable type inference failed */
    public e(Object obj, String str, int i14, l<? super h, Unit> lVar) {
        super(obj);
        this.f128626b = str;
        this.f128627c = i14;
        this.f128628d = lVar;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TextContextMenuItem(key=");
        sb3.append(this.f128621a);
        sb3.append(", label=\"");
        sb3.append(this.f128626b);
        sb3.append("\", leadingIcon=");
        return e0.j(sb3, this.f128627c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ e(Object obj, String str, int i14, l lVar, int i15, j jVar) {
        this(obj, str, (i15 & 4) != 0 ? 0 : i14, lVar);
    }
}
