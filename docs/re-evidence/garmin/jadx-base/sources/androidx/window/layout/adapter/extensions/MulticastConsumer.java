package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.common.HttpHeaders;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import k7.b;
import oe.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import qe.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "Lk7/b;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "value", "", HttpHeaders.ACCEPT, "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MulticastConsumer implements b<WindowLayoutInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f11392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f11393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f11394d;

    public MulticastConsumer(Context context) {
        context.getClass();
        this.f11391a = context;
        this.f11392b = new ReentrantLock();
        this.f11394d = new LinkedHashSet();
    }

    public final void a(b<l> bVar) {
        ReentrantLock reentrantLock = this.f11392b;
        reentrantLock.lock();
        try {
            l lVar = this.f11393c;
            if (lVar != null) {
                bVar.accept(lVar);
            }
            this.f11394d.add(bVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // k7.b
    public void accept(WindowLayoutInfo value) {
        value.getClass();
        ReentrantLock reentrantLock = this.f11392b;
        reentrantLock.lock();
        try {
            g gVar = g.f144518a;
            Context context = this.f11391a;
            gVar.getClass();
            l lVarB = g.b(context, value);
            this.f11393c = lVarB;
            Iterator it = this.f11394d.iterator();
            while (it.hasNext()) {
                ((b) it.next()).accept(lVarB);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
