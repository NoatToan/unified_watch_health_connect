package com.bumptech.glide;

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
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import defpackage.a73;
import defpackage.akp;
import defpackage.amf;
import defpackage.ark;
import defpackage.b0b;
import defpackage.b73;
import defpackage.bc1;
import defpackage.c0b;
import defpackage.c73;
import defpackage.cmf;
import defpackage.cq2;
import defpackage.d73;
import defpackage.dkh;
import defpackage.e0b;
import defpackage.e73;
import defpackage.e7g;
import defpackage.eaq;
import defpackage.efi;
import defpackage.faq;
import defpackage.flo;
import defpackage.gdq;
import defpackage.hg1;
import defpackage.hh8;
import defpackage.hp2;
import defpackage.hrk;
import defpackage.j47;
import defpackage.jqq;
import defpackage.jza;
import defpackage.kza;
import defpackage.lza;
import defpackage.m9q;
import defpackage.mdq;
import defpackage.ml9;
import defpackage.mp2;
import defpackage.mza;
import defpackage.nj1;
import defpackage.np2;
import defpackage.np5;
import defpackage.op2;
import defpackage.oqk;
import defpackage.pp2;
import defpackage.rl9;
import defpackage.rza;
import defpackage.sdq;
import defpackage.sio;
import defpackage.tio;
import defpackage.tqk;
import defpackage.u63;
import defpackage.vqk;
import defpackage.xk1;
import defpackage.xx6;
import defpackage.yfc;
import defpackage.z63;
import defpackage.zad;
import defpackage.zlf;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    public class a implements c0b.b<Registry> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.bumptech.glide.a f6949b;
        public final /* synthetic */ List c;
        public final /* synthetic */ hg1 d;

        public a(com.bumptech.glide.a aVar, List list, hg1 hg1Var) {
            this.f6949b = aVar;
            this.c = list;
            this.d = hg1Var;
        }

        @Override // c0b.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Registry get() {
            if (this.f6948a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            akp.c("Glide registry");
            this.f6948a = true;
            try {
                return e.a(this.f6949b, this.c, this.d);
            } finally {
                this.f6948a = false;
                akp.f();
            }
        }
    }

    public static Registry a(com.bumptech.glide.a aVar, List<b0b> list, hg1 hg1Var) {
        cq2 cq2VarG = aVar.g();
        nj1 nj1VarF = aVar.f();
        Context applicationContext = aVar.j().getApplicationContext();
        d dVarG = aVar.j().g();
        Registry registry = new Registry();
        b(applicationContext, registry, cq2VarG, nj1VarF, dVarG);
        c(applicationContext, aVar, registry, list, hg1Var);
        return registry;
    }

    public static void b(Context context, Registry registry, cq2 cq2Var, nj1 nj1Var, d dVar) {
        tqk z63Var;
        tqk cVar;
        Registry registry2;
        registry.o(new DefaultImageHeaderParser());
        int i = Build.VERSION.SDK_INT;
        if (i >= 27) {
            registry.o(new hh8());
        }
        Resources resources = context.getResources();
        List<ImageHeaderParser> listG = registry.g();
        d73 d73Var = new d73(context, listG, cq2Var, nj1Var);
        tqk<ParcelFileDescriptor, Bitmap> tqkVarM = jqq.m(cq2Var);
        com.bumptech.glide.load.resource.bitmap.a aVar = new com.bumptech.glide.load.resource.bitmap.a(registry.g(), resources.getDisplayMetrics(), cq2Var, nj1Var);
        if (i < 28 || !dVar.a(b.C0133b.class)) {
            z63Var = new z63(aVar);
            cVar = new com.bumptech.glide.load.resource.bitmap.c(aVar, nj1Var);
        } else {
            cVar = new zad();
            z63Var = new a73();
        }
        if (i >= 28) {
            registry.e("Animation", InputStream.class, Drawable.class, bc1.f(listG, nj1Var));
            registry.e("Animation", ByteBuffer.class, Drawable.class, bc1.a(listG, nj1Var));
        }
        vqk vqkVar = new vqk(context);
        pp2 pp2Var = new pp2(nj1Var);
        hp2 hp2Var = new hp2();
        lza lzaVar = new lza();
        ContentResolver contentResolver = context.getContentResolver();
        registry.a(ByteBuffer.class, new b73()).a(InputStream.class, new sio(nj1Var)).e("Bitmap", ByteBuffer.class, Bitmap.class, z63Var).e("Bitmap", InputStream.class, Bitmap.class, cVar);
        if (ParcelFileDescriptorRewinder.c()) {
            registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new dkh(aVar));
        }
        registry.e("Bitmap", AssetFileDescriptor.class, Bitmap.class, jqq.c(cq2Var));
        registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, tqkVarM).c(Bitmap.class, Bitmap.class, faq.a.a()).e("Bitmap", Bitmap.class, Bitmap.class, new m9q()).b(Bitmap.class, pp2Var).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new mp2(resources, z63Var)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new mp2(resources, cVar)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new mp2(resources, tqkVarM)).b(BitmapDrawable.class, new np2(cq2Var, pp2Var)).e("Animation", InputStream.class, kza.class, new tio(listG, d73Var, nj1Var)).e("Animation", ByteBuffer.class, kza.class, d73Var).b(kza.class, new mza()).c(jza.class, jza.class, faq.a.a()).e("Bitmap", jza.class, Bitmap.class, new rza(cq2Var)).d(Uri.class, Drawable.class, vqkVar).d(Uri.class, Bitmap.class, new oqk(vqkVar, cq2Var)).p(new e73.a()).c(File.class, ByteBuffer.class, new c73.b()).c(File.class, InputStream.class, new rl9.e()).d(File.class, File.class, new ml9()).c(File.class, ParcelFileDescriptor.class, new rl9.b()).c(File.class, File.class, faq.a.a()).p(new com.bumptech.glide.load.data.c.a(nj1Var));
        if (ParcelFileDescriptorRewinder.c()) {
            registry2 = registry;
            registry2.p(new ParcelFileDescriptorRewinder.a());
        } else {
            registry2 = registry;
        }
        e7g<Integer, InputStream> e7gVarG = xx6.g(context);
        e7g<Integer, AssetFileDescriptor> e7gVarC = xx6.c(context);
        e7g<Integer, Drawable> e7gVarE = xx6.e(context);
        Class cls = Integer.TYPE;
        registry2.c(cls, InputStream.class, e7gVarG).c(Integer.class, InputStream.class, e7gVarG).c(cls, AssetFileDescriptor.class, e7gVarC).c(Integer.class, AssetFileDescriptor.class, e7gVarC).c(cls, Drawable.class, e7gVarE).c(Integer.class, Drawable.class, e7gVarE).c(Uri.class, InputStream.class, hrk.f(context)).c(Uri.class, AssetFileDescriptor.class, hrk.e(context));
        ark.c cVar2 = new ark.c(resources);
        ark.a aVar2 = new ark.a(resources);
        ark.b bVar = new ark.b(resources);
        registry2.c(Integer.class, Uri.class, cVar2).c(cls, Uri.class, cVar2).c(Integer.class, AssetFileDescriptor.class, aVar2).c(cls, AssetFileDescriptor.class, aVar2).c(Integer.class, InputStream.class, bVar).c(cls, InputStream.class, bVar);
        registry2.c(String.class, InputStream.class, new np5.c()).c(Uri.class, InputStream.class, new np5.c()).c(String.class, InputStream.class, new flo.c()).c(String.class, ParcelFileDescriptor.class, new flo.b()).c(String.class, AssetFileDescriptor.class, new flo.a()).c(Uri.class, InputStream.class, new xk1.c(context.getAssets())).c(Uri.class, AssetFileDescriptor.class, new xk1.b(context.getAssets())).c(Uri.class, InputStream.class, new amf.a(context)).c(Uri.class, InputStream.class, new cmf.a(context));
        if (i >= 29) {
            registry2.c(Uri.class, InputStream.class, new efi.c(context));
            registry2.c(Uri.class, ParcelFileDescriptor.class, new efi.b(context));
        }
        registry2.c(Uri.class, InputStream.class, new gdq.d(contentResolver)).c(Uri.class, ParcelFileDescriptor.class, new gdq.b(contentResolver)).c(Uri.class, AssetFileDescriptor.class, new gdq.a(contentResolver)).c(Uri.class, InputStream.class, new sdq.a()).c(URL.class, InputStream.class, new mdq.a()).c(Uri.class, File.class, new zlf.a(context)).c(e0b.class, InputStream.class, new yfc.a()).c(byte[].class, ByteBuffer.class, new u63.a()).c(byte[].class, InputStream.class, new u63.d()).c(Uri.class, Uri.class, faq.a.a()).c(Drawable.class, Drawable.class, faq.a.a()).d(Drawable.class, Drawable.class, new eaq()).q(Bitmap.class, BitmapDrawable.class, new op2(resources)).q(Bitmap.class, byte[].class, hp2Var).q(Drawable.class, byte[].class, new j47(cq2Var, hp2Var, lzaVar)).q(kza.class, byte[].class, lzaVar);
        tqk<ByteBuffer, Bitmap> tqkVarD = jqq.d(cq2Var);
        registry2.d(ByteBuffer.class, Bitmap.class, tqkVarD);
        registry2.d(ByteBuffer.class, BitmapDrawable.class, new mp2(resources, tqkVarD));
    }

    public static void c(Context context, com.bumptech.glide.a aVar, Registry registry, List<b0b> list, hg1 hg1Var) {
        for (b0b b0bVar : list) {
            try {
                b0bVar.b(context, aVar, registry);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + b0bVar.getClass().getName(), e);
            }
        }
        if (hg1Var != null) {
            hg1Var.a(context, aVar, registry);
        }
    }

    public static c0b.b<Registry> d(com.bumptech.glide.a aVar, List<b0b> list, hg1 hg1Var) {
        return new a(aVar, list, hg1Var);
    }
}
