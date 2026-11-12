package qe;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import com.mapbox.common.HttpHeaders;
import e23.l;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s0;
import p13.j0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqe/c;", "Lqe/b;", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "component", "Lme/d;", "consumerAdapter", "<init>", "(Landroidx/window/extensions/layout/WindowLayoutComponent;Lme/d;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f144509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final me.d f144510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f144511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f144512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f144513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f144514f;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements l<WindowLayoutInfo, Unit> {
        public a(Object obj) {
            super(1, obj, MulticastConsumer.class, HttpHeaders.ACCEPT, "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(WindowLayoutInfo windowLayoutInfo) {
            WindowLayoutInfo windowLayoutInfo2 = windowLayoutInfo;
            windowLayoutInfo2.getClass();
            ((MulticastConsumer) this.receiver).accept(windowLayoutInfo2);
            return Unit.INSTANCE;
        }
    }

    public c(WindowLayoutComponent windowLayoutComponent, me.d dVar) {
        windowLayoutComponent.getClass();
        dVar.getClass();
        this.f144509a = windowLayoutComponent;
        this.f144510b = dVar;
        this.f144511c = new ReentrantLock();
        this.f144512d = new LinkedHashMap();
        this.f144513e = new LinkedHashMap();
        this.f144514f = new LinkedHashMap();
    }

    @Override // qe.b, pe.a
    public void a(Context context, Executor executor, k7.b<oe.l> bVar) {
        LinkedHashMap linkedHashMap = this.f144512d;
        context.getClass();
        ReentrantLock reentrantLock = this.f144511c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f144513e;
            if (multicastConsumer != null) {
                multicastConsumer.a(bVar);
                linkedHashMap2.put(bVar, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(bVar, context);
                multicastConsumer2.a(bVar);
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(j0.f134944a));
                    return;
                } else {
                    this.f144514f.put(multicastConsumer2, this.f144510b.a(this.f144509a, s0.f105811a.b(WindowLayoutInfo.class), (Activity) context, new a(multicastConsumer2)));
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // qe.b, pe.a
    public void b(k7.b<oe.l> bVar) {
        LinkedHashMap linkedHashMap = this.f144512d;
        LinkedHashMap linkedHashMap2 = this.f144513e;
        ReentrantLock reentrantLock = this.f144511c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(bVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            LinkedHashSet linkedHashSet = multicastConsumer.f11394d;
            ReentrantLock reentrantLock2 = multicastConsumer.f11392b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(bVar);
                reentrantLock2.unlock();
                linkedHashMap2.remove(bVar);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    me.d.b bVar2 = (me.d.b) this.f144514f.remove(multicastConsumer);
                    if (bVar2 != null) {
                        bVar2.dispose();
                    }
                }
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
            } catch (Throwable th3) {
                reentrantLock2.unlock();
                throw th3;
            }
        } catch (Throwable th4) {
            reentrantLock.unlock();
            throw th4;
        }
    }
}
