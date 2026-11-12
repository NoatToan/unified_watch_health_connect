package com.bumptech.glide;

import android.os.Trace;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class h implements qj.g<Registry> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f28495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f28496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f28497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj.a f28498d;

    public h(b bVar, List list, kj.a aVar) {
        this.f28496b = bVar;
        this.f28497c = list;
        this.f28498d = aVar;
    }

    @Override // qj.g
    public final Registry get() {
        if (this.f28495a) {
            vb.h.z("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            return null;
        }
        Trace.beginSection(ce.a.d("Glide registry"));
        this.f28495a = true;
        try {
            return i.a(this.f28496b, this.f28497c, this.f28498d);
        } finally {
            this.f28495a = false;
            Trace.endSection();
        }
    }
}
