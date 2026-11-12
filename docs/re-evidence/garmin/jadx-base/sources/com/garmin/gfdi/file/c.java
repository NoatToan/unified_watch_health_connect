package com.garmin.gfdi.file;

import e23.p;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;
import ws2.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lws2/l;", "<anonymous>", "(Lo53/b0;)Lws2/l;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.file.FileManager$readFile$3", f = "FileManager.kt", l = {332, 343}, m = "invokeSuspend")
public final class c extends i implements p<b0, t13.d<? super l>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FileOutputStream f52378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f52379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ File f52380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f52381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f52382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f52383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p<Integer, Integer, Unit> f52384g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(File file, boolean z14, a aVar, int i14, p<? super Integer, ? super Integer, Unit> pVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f52380c = file;
        this.f52381d = z14;
        this.f52382e = aVar;
        this.f52383f = i14;
        this.f52384g = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f52380c, this.f52381d, this.f52382e, this.f52383f, this.f52384g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super l> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws FileException {
        Throwable th3;
        FileOutputStream fileOutputStream;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f52379b;
        a aVar2 = this.f52382e;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 == 2) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fileOutputStream = this.f52378a;
            try {
                r.b(obj);
                jg.b.l(fileOutputStream, null);
                return obj;
            } catch (Throwable th4) {
                th3 = th4;
                try {
                    throw th3;
                } catch (Throwable th5) {
                    jg.b.l(fileOutputStream, th3);
                    throw th5;
                }
            }
        }
        r.b(obj);
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(this.f52380c);
            int i15 = this.f52383f;
            boolean z14 = this.f52381d;
            p<Integer, Integer, Unit> pVar = this.f52384g;
            try {
                this.f52378a = fileOutputStream2;
                this.f52379b = 1;
                obj = aVar2.f52367h.b(0, new d(aVar2, i15, z14, pVar, fileOutputStream2, null), this);
                if (obj != aVar) {
                    fileOutputStream = fileOutputStream2;
                    jg.b.l(fileOutputStream, null);
                    return obj;
                }
            } catch (Throwable th6) {
                th3 = th6;
                fileOutputStream = fileOutputStream2;
                throw th3;
            }
        } catch (FileException e4) {
            if (!this.f52381d || e4.getReason() != FileException.a.CANCELLED_BY_DEVICE) {
                throw e4;
            }
            this.f52378a = null;
            this.f52379b = 2;
            aVar2.getClass();
            Object objY = ge1.b.Y(new c(this.f52380c, false, aVar2, this.f52383f, this.f52384g, null), this);
            if (objY != aVar) {
                return objY;
            }
        } catch (FileNotFoundException e14) {
            throw new FileException(e14);
        } catch (SecurityException e15) {
            throw new FileException(e15);
        }
        return aVar;
    }
}
