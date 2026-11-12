package qe;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import oe.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqe/d;", "Lqe/c;", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "component", "Lme/d;", "adapter", "<init>", "(Landroidx/window/extensions/layout/WindowLayoutComponent;Lme/d;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class d extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ReentrantLock f144515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f144516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f144517i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(WindowLayoutComponent windowLayoutComponent, me.d dVar) {
        super(windowLayoutComponent, dVar);
        windowLayoutComponent.getClass();
        dVar.getClass();
        this.f144515g = new ReentrantLock();
        this.f144516h = new LinkedHashMap();
        this.f144517i = new LinkedHashMap();
    }

    @Override // qe.c, qe.b, pe.a
    public final void a(Context context, Executor executor, k7.b<l> bVar) {
        LinkedHashMap linkedHashMap = this.f144516h;
        context.getClass();
        ReentrantLock reentrantLock = this.f144515g;
        reentrantLock.lock();
        try {
            h hVar = (h) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f144517i;
            if (hVar != null) {
                hVar.a(bVar);
                linkedHashMap2.put(bVar, context);
            } else {
                h hVar2 = new h(context);
                linkedHashMap.put(context, hVar2);
                linkedHashMap2.put(bVar, context);
                hVar2.a(bVar);
                this.f144509a.addWindowLayoutInfoListener(context, hVar2);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // qe.c, qe.b, pe.a
    public final void b(k7.b<l> bVar) {
        LinkedHashMap linkedHashMap = this.f144516h;
        LinkedHashMap linkedHashMap2 = this.f144517i;
        ReentrantLock reentrantLock = this.f144515g;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(bVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            h hVar = (h) linkedHashMap.get(context);
            if (hVar == null) {
                reentrantLock.unlock();
                return;
            }
            ReentrantLock reentrantLock2 = hVar.f144520b;
            reentrantLock2.lock();
            try {
                hVar.f144522d.remove(bVar);
                reentrantLock2.unlock();
                linkedHashMap2.remove(bVar);
                if (hVar.f144522d.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.f144509a.removeWindowLayoutInfoListener(hVar);
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
