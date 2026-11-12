package k4;

import android.content.ClipData;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lk4/k;", "", "Landroid/content/ClipData;", "clipData", "localState", "", "flags", "<init>", "(Landroid/content/ClipData;Ljava/lang/Object;I)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClipData f102823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f102824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f102825c;

    public /* synthetic */ k(ClipData clipData, Object obj, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(clipData, (i15 & 2) != 0 ? null : obj, (i15 & 4) != 0 ? 0 : i14);
    }

    public k(ClipData clipData, Object obj, int i14) {
        this.f102823a = clipData;
        this.f102824b = obj;
        this.f102825c = i14;
    }
}
