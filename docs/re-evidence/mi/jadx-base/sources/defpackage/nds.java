package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes11.dex */
public class nds implements Callable<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f27826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27827b;
    public final /* synthetic */ kds c;

    public nds(kds kdsVar, Context context, String str) {
        this.c = kdsVar;
        this.f27826a = context;
        this.f27827b = str;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String call() {
        return String.valueOf(n3s.a(this.f27826a, this.f27827b));
    }
}
