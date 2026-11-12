package ld;

import android.content.Context;
import androidx.room.b0;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import md.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import r1.q2;
import vb.h;
import wd.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lld/d;", "Lvd/d;", "Landroidx/room/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "", "databaseVersion", "delegate", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILvd/d;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements vd.d, androidx.room.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f112019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f112020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f112021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Callable<InputStream> f112022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f112023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vd.d f112024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.room.c f112025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f112026h;

    public d(Context context, String str, File file, Callable<InputStream> callable, int i14, vd.d dVar) {
        context.getClass();
        dVar.getClass();
        this.f112019a = context;
        this.f112020b = str;
        this.f112021c = file;
        this.f112022d = callable;
        this.f112023e = i14;
        this.f112024f = dVar;
    }

    public final void a(File file, boolean z14) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        Context context = this.f112019a;
        String str = this.f112020b;
        if (str != null) {
            readableByteChannelNewChannel = Channels.newChannel(context.getAssets().open(str));
            readableByteChannelNewChannel.getClass();
        } else {
            File file2 = this.f112021c;
            if (file2 != null) {
                readableByteChannelNewChannel = new FileInputStream(file2).getChannel();
                readableByteChannelNewChannel.getClass();
            } else {
                Callable<InputStream> callable = this.f112022d;
                if (callable == null) {
                    h.z("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
                    return;
                }
                try {
                    readableByteChannelNewChannel = Channels.newChannel(callable.call());
                    readableByteChannelNewChannel.getClass();
                } catch (Exception e4) {
                    h.u("inputStreamCallable exception on call", e4);
                    return;
                }
            }
        }
        ReadableByteChannel readableByteChannel = readableByteChannelNewChannel;
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", context.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(fileCreateTempFile).getChannel();
        channel.getClass();
        try {
            channel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            channel.force(false);
            readableByteChannel.close();
            channel.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                o2.c.u(file.getAbsolutePath(), "Failed to create directories for ");
                return;
            }
            androidx.room.c cVar = this.f112025g;
            if (cVar == null) {
                s.m("databaseConfiguration");
                throw null;
            }
            if (cVar.f10786q != null) {
                try {
                    int iS = gl1.d.S(fileCreateTempFile);
                    f fVar = new f();
                    vd.d.b.f177135f.getClass();
                    vd.d.b.a aVar = new vd.d.b.a(context);
                    aVar.f177142b = fileCreateTempFile.getAbsolutePath();
                    aVar.f177143c = new c(iS, iS >= 1 ? iS : 1);
                    vd.d dVarB = fVar.b(aVar.a());
                    try {
                        vd.c writableDatabase = z14 ? ((wd.d) dVarB).getWritableDatabase() : ((wd.d.c) ((wd.d) dVarB).f184334f.getValue()).a(false);
                        androidx.room.c cVar2 = this.f112025g;
                        if (cVar2 == null) {
                            s.m("databaseConfiguration");
                            throw null;
                        }
                        cVar2.f10786q.getClass();
                        writableDatabase.getClass();
                        Unit unit = Unit.INSTANCE;
                        ((wd.d) dVarB).close();
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            jg.b.l(dVarB, th3);
                            throw th4;
                        }
                    }
                } catch (IOException e14) {
                    q2.v("Malformed database file, unable to read version.", e14);
                    return;
                }
            }
            if (fileCreateTempFile.renameTo(file)) {
                return;
            }
            throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        } catch (Throwable th5) {
            readableByteChannel.close();
            channel.close();
            throw th5;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f112024f.close();
        this.f112026h = false;
    }

    @Override // vd.d
    /* JADX INFO: renamed from: getDatabaseName */
    public final String getF184330b() {
        return this.f112024f.getF184330b();
    }

    @Override // androidx.room.d
    /* JADX INFO: renamed from: getDelegate, reason: from getter */
    public final vd.d getF112024f() {
        return this.f112024f;
    }

    @Override // vd.d
    public final vd.c getWritableDatabase() {
        boolean z14 = this.f112026h;
        vd.d dVar = this.f112024f;
        if (!z14) {
            String f184330b = dVar.getF184330b();
            if (f184330b != null) {
                Context context = this.f112019a;
                File databasePath = context.getDatabasePath(f184330b);
                androidx.room.c cVar = this.f112025g;
                if (cVar == null) {
                    s.m("databaseConfiguration");
                    throw null;
                }
                yd.a aVar = new yd.a(f184330b, context.getFilesDir(), cVar.f10792w);
                try {
                    aVar.a(aVar.f196750a);
                    if (databasePath.exists()) {
                        try {
                            int iS = gl1.d.S(databasePath);
                            int i14 = this.f112023e;
                            if (iS != i14) {
                                androidx.room.c cVar2 = this.f112025g;
                                if (cVar2 == null) {
                                    s.m("databaseConfiguration");
                                    throw null;
                                }
                                b0.e eVar = cVar2.f10773d;
                                eVar.getClass();
                                if (l.a(eVar, iS, i14) == null) {
                                    androidx.room.c cVar3 = this.f112025g;
                                    if (cVar3 == null) {
                                        s.m("databaseConfiguration");
                                        throw null;
                                    }
                                    if (!l.b(cVar3, iS, i14) && context.deleteDatabase(f184330b)) {
                                        a(databasePath, true);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                }
                            }
                        } catch (IOException unused) {
                        }
                    } else {
                        try {
                            a(databasePath, true);
                        } catch (IOException e4) {
                            throw new RuntimeException("Unable to copy database file.", e4);
                        }
                    }
                    aVar.b();
                } catch (Throwable th3) {
                    aVar.b();
                    throw th3;
                }
            } else {
                h.z("Required value was null.");
            }
            this.f112026h = true;
        }
        return dVar.getWritableDatabase();
    }

    @Override // vd.d
    public final void setWriteAheadLoggingEnabled(boolean z14) {
        this.f112024f.setWriteAheadLoggingEnabled(z14);
    }
}
