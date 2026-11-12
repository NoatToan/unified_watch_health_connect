package com.bumptech.glide;

import aj.t;
import aj.u;
import aj.w;
import aj.y;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import dj.b0;
import dj.e0;
import dj.f0;
import dj.m;
import dj.p;
import dj.v;
import dj.x;
import dj.z;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class i {
    private i() {
    }

    public static Registry a(b bVar, List<kj.b> list, kj.a aVar) {
        ui.j gVar;
        ui.j b0Var;
        xi.d dVar = bVar.f28454b;
        xi.b bVar2 = bVar.f28457e;
        d dVar2 = bVar.f28456d;
        Context applicationContext = dVar2.getApplicationContext();
        e eVar = dVar2.f28484h;
        Registry registry = new Registry();
        DefaultImageHeaderParser defaultImageHeaderParser = new DefaultImageHeaderParser();
        lj.b bVar3 = registry.f28447g;
        synchronized (bVar3) {
            bVar3.f112921a.add(defaultImageHeaderParser);
        }
        p pVar = new p();
        lj.b bVar4 = registry.f28447g;
        synchronized (bVar4) {
            bVar4.f112921a.add(pVar);
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListE = registry.e();
        ui.j aVar2 = new hj.a(applicationContext, arrayListE, dVar, bVar2);
        ui.j f0Var = new f0(dVar, new f0.g());
        m mVar = new m(registry.e(), resources.getDisplayMetrics(), dVar, bVar2);
        if (eVar.f28487a.containsKey(c.b.class)) {
            b0Var = new v();
            gVar = new dj.h();
        } else {
            gVar = new dj.g(mVar);
            b0Var = new b0(mVar, bVar2);
        }
        registry.d("Animation", InputStream.class, Drawable.class, fj.a.c(arrayListE, bVar2));
        registry.d("Animation", ByteBuffer.class, Drawable.class, fj.a.a(arrayListE, bVar2));
        fj.e eVar2 = new fj.e(applicationContext);
        ui.k cVar = new dj.c(bVar2);
        ij.e aVar3 = new ij.a();
        ij.e dVar3 = new ij.d();
        ContentResolver contentResolver = applicationContext.getContentResolver();
        registry.b(ByteBuffer.class, new aj.c());
        registry.b(InputStream.class, new aj.v(bVar2));
        registry.d("Bitmap", ByteBuffer.class, Bitmap.class, gVar);
        registry.d("Bitmap", InputStream.class, Bitmap.class, b0Var);
        String str = Build.FINGERPRINT;
        if (!"robolectric".equals(str)) {
            registry.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new x(mVar));
        }
        registry.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new f0(dVar, new f0.c(null)));
        registry.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, f0Var);
        aj.p pVar2 = aj.x.a.f3407a;
        registry.a(Bitmap.class, Bitmap.class, pVar2);
        registry.d("Bitmap", Bitmap.class, Bitmap.class, new e0());
        registry.c(Bitmap.class, cVar);
        registry.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new dj.a(resources, gVar));
        registry.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new dj.a(resources, b0Var));
        registry.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new dj.a(resources, f0Var));
        registry.c(BitmapDrawable.class, new dj.b(dVar, cVar));
        registry.d("Animation", InputStream.class, hj.c.class, new hj.j(arrayListE, aVar2, bVar2));
        registry.d("Animation", ByteBuffer.class, hj.c.class, aVar2);
        registry.c(hj.c.class, new hj.d());
        registry.a(si.a.class, si.a.class, pVar2);
        registry.d("Bitmap", si.a.class, Bitmap.class, new hj.h(dVar));
        registry.d("legacy_append", Uri.class, Drawable.class, eVar2);
        registry.d("legacy_append", Uri.class, Bitmap.class, new z(eVar2, dVar));
        registry.h(new ej.a.C1363a());
        registry.a(File.class, ByteBuffer.class, new aj.d.b());
        registry.a(File.class, InputStream.class, new aj.g.e());
        registry.d("legacy_append", File.class, File.class, new gj.a());
        registry.a(File.class, ParcelFileDescriptor.class, new aj.g.b());
        registry.a(File.class, File.class, pVar2);
        registry.h(new com.bumptech.glide.load.data.k.a(bVar2));
        if (!"robolectric".equals(str)) {
            registry.h(new ParcelFileDescriptorRewinder.a());
        }
        aj.p cVar2 = new aj.f.c(applicationContext);
        aj.p aVar4 = new aj.f.a(applicationContext);
        aj.p bVar5 = new aj.f.b(applicationContext);
        Class cls = Integer.TYPE;
        registry.a(cls, InputStream.class, cVar2);
        registry.a(Integer.class, InputStream.class, cVar2);
        registry.a(cls, AssetFileDescriptor.class, aVar4);
        registry.a(Integer.class, AssetFileDescriptor.class, aVar4);
        registry.a(cls, Drawable.class, bVar5);
        registry.a(Integer.class, Drawable.class, bVar5);
        registry.a(Uri.class, InputStream.class, new u.b(applicationContext));
        registry.a(Uri.class, AssetFileDescriptor.class, new u.a(applicationContext));
        aj.p cVar3 = new t.c(resources);
        aj.p aVar5 = new t.a(resources);
        aj.p bVar6 = new t.b(resources);
        registry.a(Integer.class, Uri.class, cVar3);
        registry.a(cls, Uri.class, cVar3);
        registry.a(Integer.class, AssetFileDescriptor.class, aVar5);
        registry.a(cls, AssetFileDescriptor.class, aVar5);
        registry.a(Integer.class, InputStream.class, bVar6);
        registry.a(cls, InputStream.class, bVar6);
        registry.a(String.class, InputStream.class, new aj.e.c());
        registry.a(Uri.class, InputStream.class, new aj.e.c());
        registry.a(String.class, InputStream.class, new w.c());
        registry.a(String.class, ParcelFileDescriptor.class, new w.b());
        registry.a(String.class, AssetFileDescriptor.class, new w.a());
        registry.a(Uri.class, InputStream.class, new aj.a.c(applicationContext.getAssets()));
        registry.a(Uri.class, AssetFileDescriptor.class, new aj.a.b(applicationContext.getAssets()));
        registry.a(Uri.class, InputStream.class, new bj.b.a(applicationContext));
        registry.a(Uri.class, InputStream.class, new bj.c.a(applicationContext));
        if (Build.VERSION.SDK_INT >= 29) {
            registry.a(Uri.class, InputStream.class, new bj.d.c(applicationContext));
            registry.a(Uri.class, ParcelFileDescriptor.class, new bj.d.b(applicationContext));
        }
        boolean zContainsKey = eVar.f28487a.containsKey(c.e.class);
        registry.a(Uri.class, InputStream.class, new y.d(contentResolver, zContainsKey));
        registry.a(Uri.class, ParcelFileDescriptor.class, new y.b(contentResolver, zContainsKey));
        registry.a(Uri.class, AssetFileDescriptor.class, new y.a(contentResolver, zContainsKey));
        registry.a(Uri.class, InputStream.class, new aj.z.a());
        registry.a(URL.class, InputStream.class, new bj.e.a());
        registry.a(Uri.class, File.class, new aj.l.a(applicationContext));
        registry.a(aj.h.class, InputStream.class, new bj.a.C0265a());
        registry.a(byte[].class, ByteBuffer.class, new aj.b.a());
        registry.a(byte[].class, InputStream.class, new aj.b.d());
        registry.a(Uri.class, Uri.class, pVar2);
        registry.a(Drawable.class, Drawable.class, pVar2);
        registry.d("legacy_append", Drawable.class, Drawable.class, new fj.f());
        registry.i(Bitmap.class, BitmapDrawable.class, new ij.b(resources));
        registry.i(Bitmap.class, byte[].class, aVar3);
        registry.i(Drawable.class, byte[].class, new ij.c(dVar, aVar3, dVar3));
        registry.i(hj.c.class, byte[].class, dVar3);
        ui.j f0Var2 = new f0(dVar, new f0.d());
        registry.d("legacy_append", ByteBuffer.class, Bitmap.class, f0Var2);
        registry.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new dj.a(resources, f0Var2));
        for (kj.b bVar7 : list) {
            try {
                bVar7.a(applicationContext, bVar, registry);
            } catch (AbstractMethodError e4) {
                com.airbnb.lottie.animation.keyframe.a.x("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(bVar7.getClass().getName()), e4);
                return null;
            }
        }
        if (aVar != null) {
            aVar.a(applicationContext, bVar, registry);
        }
        return registry;
    }
}
