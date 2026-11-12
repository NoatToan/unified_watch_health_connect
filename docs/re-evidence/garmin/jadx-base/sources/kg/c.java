package kg;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes7.dex */
public class c implements ig.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kh.b f104675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f104676b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f104677c = false;

    @Override // ig.a
    public final String a(Context context) {
        if (context != null) {
            if (!this.f104676b) {
                kh.b bVar = new kh.b();
                this.f104675a = bVar;
                bVar.f104708a = context;
                bVar.f104710c = new kh.a(bVar);
                Intent intent = new Intent();
                intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
                this.f104677c = bVar.f104708a.bindService(intent, bVar.f104710c, 1);
                this.f104676b = true;
            }
            if (this.f104677c) {
                kh.b bVar2 = this.f104675a;
                bVar2.getClass();
                boolean zC = false;
                try {
                    ih.a aVar = bVar2.f104709b;
                    if (aVar != null) {
                        zC = aVar.c();
                    }
                } catch (RemoteException unused) {
                }
                if (zC) {
                    kh.b bVar3 = this.f104675a;
                    if (bVar3.f104708a == null) {
                        vb.h.s("Context is null, must be new OpenDeviceId first");
                        return null;
                    }
                    try {
                        ih.a aVar2 = bVar3.f104709b;
                        if (aVar2 != null) {
                            return aVar2.a();
                        }
                        return null;
                    } catch (RemoteException e4) {
                        e4.printStackTrace();
                        return null;
                    }
                }
            }
        }
        return null;
    }
}
