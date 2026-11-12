package qe;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import oe.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqe/h;", "Lk7/b;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "Landroidx/window/reflection/Consumer2;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h implements k7.b<WindowLayoutInfo>, Consumer2<WindowLayoutInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f144519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f144520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f144521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f144522d;

    public h(Context context) {
        context.getClass();
        this.f144519a = context;
        this.f144520b = new ReentrantLock();
        this.f144522d = new LinkedHashSet();
    }

    public final void a(k7.b<l> bVar) {
        ReentrantLock reentrantLock = this.f144520b;
        reentrantLock.lock();
        try {
            l lVar = this.f144521c;
            if (lVar != null) {
                bVar.accept(lVar);
            }
            this.f144522d.add(bVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // k7.b
    public final void accept(WindowLayoutInfo windowLayoutInfo) {
        WindowLayoutInfo windowLayoutInfo2 = windowLayoutInfo;
        windowLayoutInfo2.getClass();
        ReentrantLock reentrantLock = this.f144520b;
        reentrantLock.lock();
        try {
            g gVar = g.f144518a;
            Context context = this.f144519a;
            gVar.getClass();
            l lVarB = g.b(context, windowLayoutInfo2);
            this.f144521c = lVarB;
            Iterator it = this.f144522d.iterator();
            while (it.hasNext()) {
                ((k7.b) it.next()).accept(lVarB);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
