package com.garmin.android.gfdi.framework;

import am.j;
import com.garmin.android.deviceinterface.capabilities.SyncDownloadCapability;
import com.garmin.android.gfdi.filetransfer.FileManagerCapability;
import com.garmin.android.gfdi.filetransfer.RemoteFile;
import com.garmin.gfdi.file.FileException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import e23.p;
import ea2.f;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import o13.r;
import o53.b0;
import o53.e1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.a1;
import p13.j0;
import p13.l0;
import p13.y;
import v13.i;
import vb.h;
import wb2.m0;
import wb2.t0;
import wb2.v;

/* JADX INFO: loaded from: classes8.dex */
@o13.e
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0001\u0018\u0000 C2\u00020\u0001:\u0001CB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010%\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0017\u001a\u00020$¢\u0006\u0004\b%\u0010&JM\u00100\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010\u00132\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010\u00132\u0006\u0010.\u001a\u00020-2\b\u0010\u0017\u001a\u0004\u0018\u00010/¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020-2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b2\u00103J\u0013\u00104\u001a\b\u0012\u0004\u0012\u00020 0\b¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0004\u0018\u00010\u00132\u0006\u00106\u001a\u00020\u0011¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0016\u0010;\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lcom/garmin/android/gfdi/framework/FileManagerCompat;", "Lcom/garmin/android/gfdi/filetransfer/FileManagerCapability;", "Lcom/garmin/gfdi/file/a;", "fileManager", "Lrs2/c;", "deviceInfo", "<init>", "(Lcom/garmin/gfdi/file/a;Lrs2/c;)V", "", "Lws2/a;", "getSupportedFileTypes", "(Lt13/d;)Ljava/lang/Object;", "Lcom/garmin/android/gfdi/filetransfer/FileManagerCapability$FileReadOptions;", "options", "", "setDefaultFileReadOptions", "(Lcom/garmin/android/gfdi/filetransfer/FileManagerCapability$FileReadOptions;)V", "", "fileIndex", "", "destFileDir", "destFileName", "Lea2/f$c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "readFile", "(ILjava/lang/String;Ljava/lang/String;Lea2/f$c;)V", "Lea2/f$d;", "readDeviceXml", "(Lea2/f$d;)V", "Lea2/f$a;", "archive", "(ILea2/f$a;)V", "", "filterType", "", "fileSubTypeFilters", "Lea2/f$b;", "listFiles", "(B[BLea2/f$b;)V", "itemId", "Ljava/io/File;", "sourceFile", "dataType", "dataSubType", "absoluteFilePathInRemoteDevice", "", "allowCompression", "Lcom/garmin/android/deviceinterface/capabilities/SyncDownloadCapability$ResultListener;", "saveFile", "(Ljava/lang/String;Ljava/io/File;BBLjava/lang/String;ZLcom/garmin/android/deviceinterface/capabilities/SyncDownloadCapability$ResultListener;)V", "isFileUploadInProgress", "(I)Z", "getSupportedFileSubTypes", "()Ljava/util/List;", "fileSubType", "resolveGarminDeviceFileType", "(I)Ljava/lang/String;", "Lcom/garmin/gfdi/file/a;", "Lrs2/c;", "defaultReadOptions", "Lcom/garmin/android/gfdi/filetransfer/FileManagerCapability$FileReadOptions;", "currentAbsoluteFilePath", "Ljava/lang/String;", "lock", "[B", "supportedFileTypes", "Ljava/util/List;", "Companion", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileManagerCompat implements FileManagerCapability {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final FileManagerCapability.FileReadOptions DEFAULT_FILE_READ_OPTIONS = new FileManagerCapability.FileReadOptions(true);
    public static final byte FILTER_TYPE_NO_FILTER = 0;
    public static final byte FILTER_TYPE_PENDING_UPLOADS = 3;
    public static final int GARMIN_DEVICE_XML_FILE_INDEX = 65533;
    private String currentAbsoluteFilePath;
    private FileManagerCapability.FileReadOptions defaultReadOptions;
    private final rs2.c deviceInfo;
    private final com.garmin.gfdi.file.a fileManager;
    private final byte[] lock;
    private List<ws2.a> supportedFileTypes;

    /* JADX INFO: renamed from: com.garmin.android.gfdi.framework.FileManagerCompat$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.gfdi.framework.FileManagerCompat$1", f = "FileManagerCompat.kt", l = {42}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p<b0, t13.d<? super Unit>, Object> {
        int label;

        public AnonymousClass1(t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return FileManagerCompat.this.new AnonymousClass1(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                FileManagerCompat fileManagerCompat = FileManagerCompat.this;
                this.label = 1;
                if (fileManagerCompat.getSupportedFileTypes(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gfdi.framework.FileManagerCompat$archive$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.gfdi.framework.FileManagerCompat$archive$1", f = "FileManagerCompat.kt", l = {86}, m = "invokeSuspend")
    public static final class C38901 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ int $fileIndex;
        final /* synthetic */ f.a $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38901(int i14, f.a aVar, t13.d<? super C38901> dVar) {
            super(2, dVar);
            this.$fileIndex = i14;
            this.$listener = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return FileManagerCompat.this.new C38901(this.$fileIndex, this.$listener, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C38901) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    com.garmin.gfdi.file.a aVar2 = FileManagerCompat.this.fileManager;
                    int i15 = this.$fileIndex;
                    this.label = 1;
                    if (aVar2.b(i15, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                f.a aVar3 = this.$listener;
                String.valueOf(this.$fileIndex);
                ((wb2.b0.b) aVar3).a();
            } catch (FileException e4) {
                FileException.a reason = e4.getReason();
                FileException.a aVar4 = FileException.a.NOT_SUPPORTED;
                f.a aVar5 = this.$listener;
                int i16 = this.$fileIndex;
                if (reason == aVar4) {
                    String.valueOf(i16);
                    ((wb2.b0.b) aVar5).a();
                } else {
                    String strValueOf = String.valueOf(i16);
                    e4.getMessage();
                    wb2.b0 b0Var = wb2.b0.this;
                    int i17 = wb2.b0.F;
                    t0 t0Var = b0Var.f184164f.get(b0Var.e0(strValueOf));
                    b0Var.K(v.c.FAILED_REMOTE_DEVICE_EXCEPTION, wb2.h.REMOTE_DEVICE_EXCEPTION, "Unable to archive file in remote device", (t0Var == null || !t0Var.a()) ? v.a.REMOTE_DEVICE_DISCONNECTED.f184192a : v.a.REMOTE_DEVICE_NOT_AVAILABLE.f184192a, null);
                    b0Var.w("Unable to archive file in remote device");
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gfdi.framework.FileManagerCompat$getSupportedFileTypes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.gfdi.framework.FileManagerCompat", f = "FileManagerCompat.kt", l = {208}, m = "getSupportedFileTypes")
    public static final class C38921 extends v13.c {
        int label;
        /* synthetic */ Object result;

        public C38921(t13.d<? super C38921> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileManagerCompat.this.getSupportedFileTypes(this);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gfdi.framework.FileManagerCompat$listFiles$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.gfdi.framework.FileManagerCompat$listFiles$1", f = "FileManagerCompat.kt", l = {114}, m = "invokeSuspend")
    public static final class C38931 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ byte[] $fileSubTypeFilters;
        final /* synthetic */ ws2.b $filter;
        final /* synthetic */ f.b $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38931(ws2.b bVar, f.b bVar2, byte[] bArr, t13.d<? super C38931> dVar) {
            super(2, dVar);
            this.$filter = bVar;
            this.$listener = bVar2;
            this.$fileSubTypeFilters = bArr;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return FileManagerCompat.this.new C38931(this.$filter, this.$listener, this.$fileSubTypeFilters, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C38931) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Set setB;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    com.garmin.gfdi.file.a aVar2 = FileManagerCompat.this.fileManager;
                    ws2.b bVar = this.$filter;
                    this.label = 1;
                    obj = aVar2.g(bVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                List list = (List) obj;
                ArrayList<ws2.c> arrayList = new ArrayList();
                for (Object obj2 : list) {
                    ws2.c cVar = (ws2.c) obj2;
                    if (cVar.f186966d.contains(com.garmin.gfdi.file.e.READ) && !cVar.f186966d.contains(com.garmin.gfdi.file.e.ARCHIVE)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                for (ws2.c cVar2 : arrayList) {
                    arrayList2.add(new RemoteFile((byte) cVar2.f186964b, cVar2.f186965c, cVar2.f186963a, cVar2.f186967e, cVar2.f186968f));
                }
                byte[] bArr = this.$fileSubTypeFilters;
                if (bArr != null && bArr.length != 0) {
                    int length = bArr.length;
                    if (length == 0) {
                        setB = l0.f134950a;
                    } else if (length != 1) {
                        setB = new LinkedHashSet(p13.t0.a(bArr.length));
                        for (byte b14 : bArr) {
                            setB.add(Byte.valueOf(b14));
                        }
                    } else {
                        setB = a1.b(Byte.valueOf(bArr[0]));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : arrayList2) {
                        if (setB.contains(Byte.valueOf(((RemoteFile) obj3).getSubType()))) {
                            arrayList3.add(obj3);
                        }
                    }
                    arrayList2 = arrayList3;
                }
                m0 m0Var = (m0) this.$listener;
                m0Var.getClass();
                int size = arrayList2.size();
                String[] strArr = new String[size];
                long[] jArr = new long[size];
                byte[] bArr2 = new byte[size];
                byte[] bArr3 = new byte[size];
                for (int i15 = 0; i15 < size; i15++) {
                    RemoteFile remoteFile = (RemoteFile) arrayList2.get(i15);
                    strArr[i15] = Integer.toString(remoteFile.getIndex());
                    jArr[i15] = remoteFile.getSize();
                    bArr2[i15] = remoteFile.getDataType();
                    bArr3[i15] = remoteFile.getSubType();
                }
                ((wb2.b0.a) m0Var.f184065a).a(strArr, jArr, bArr2, bArr3);
                return Unit.INSTANCE;
            } catch (FileException e4) {
                f.b bVar2 = this.$listener;
                String message = e4.getMessage();
                if (message == null) {
                    message = "Operation failed";
                }
                String str = message;
                wb2.b0 b0Var = wb2.b0.this;
                b0Var.getClass();
                b0Var.K(v.c.FAILED_REMOTE_DEVICE_EXCEPTION, wb2.h.REMOTE_DEVICE_EXCEPTION, str, "Failed to get directory from device", null);
                b0Var.w(str);
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gfdi.framework.FileManagerCompat$readDeviceXml$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.gfdi.framework.FileManagerCompat$readDeviceXml$1", f = "FileManagerCompat.kt", l = {73}, m = "invokeSuspend")
    public static final class C38941 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ f.d $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38941(f.d dVar, t13.d<? super C38941> dVar2) {
            super(2, dVar2);
            this.$listener = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(f.d dVar, int i14, int i15) {
            dVar.a(i14, i15);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return FileManagerCompat.this.new C38941(this.$listener, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C38941) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    FileManagerCapability.FileReadOptions fileReadOptions = FileManagerCompat.this.defaultReadOptions;
                    com.garmin.gfdi.file.a aVar2 = FileManagerCompat.this.fileManager;
                    boolean useCompression = fileReadOptions.getUseCompression();
                    final f.d dVar = this.$listener;
                    p pVar = new p() { // from class: com.garmin.android.gfdi.framework.a
                        @Override // e23.p
                        public final Object invoke(Object obj2, Object obj3) {
                            return FileManagerCompat.C38941.invokeSuspend$lambda$0(dVar, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                        }
                    };
                    this.label = 1;
                    obj = aVar2.h(FileManagerCompat.GARMIN_DEVICE_XML_FILE_INDEX, useCompression, pVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                this.$listener.c((byte[]) obj);
            } catch (Exception e4) {
                f.d dVar2 = this.$listener;
                String message = e4.getMessage();
                if (message == null) {
                    message = "Operation failed";
                }
                dVar2.b(message);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gfdi.framework.FileManagerCompat$readFile$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.gfdi.framework.FileManagerCompat$readFile$1", f = "FileManagerCompat.kt", l = {58}, m = "invokeSuspend")
    public static final class C38951 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ String $destFileDir;
        final /* synthetic */ String $destFileName;
        final /* synthetic */ int $fileIndex;
        final /* synthetic */ f.c $listener;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38951(String str, int i14, String str2, f.c cVar, t13.d<? super C38951> dVar) {
            super(2, dVar);
            this.$destFileName = str;
            this.$fileIndex = i14;
            this.$destFileDir = str2;
            this.$listener = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(f.c cVar, int i14, int i15, int i16) {
            cVar.a(i15, String.valueOf(i14));
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return FileManagerCompat.this.new C38951(this.$destFileName, this.$fileIndex, this.$destFileDir, this.$listener, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C38951) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            File file;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    FileManagerCapability.FileReadOptions fileReadOptions = FileManagerCompat.this.defaultReadOptions;
                    String str = this.$destFileName;
                    if (str == null) {
                        str = FileManagerCompat.this.deviceInfo.getF92746j() + "_" + this.$fileIndex + "_" + UUID.randomUUID();
                    }
                    File file2 = new File(this.$destFileDir, str);
                    com.garmin.gfdi.file.a aVar2 = FileManagerCompat.this.fileManager;
                    int i15 = this.$fileIndex;
                    boolean useCompression = fileReadOptions.getUseCompression();
                    final f.c cVar = this.$listener;
                    final int i16 = this.$fileIndex;
                    p pVar = new p() { // from class: com.garmin.android.gfdi.framework.b
                        @Override // e23.p
                        public final Object invoke(Object obj2, Object obj3) {
                            return FileManagerCompat.C38951.invokeSuspend$lambda$0(cVar, i16, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                        }
                    };
                    this.L$0 = file2;
                    this.label = 1;
                    aVar2.getClass();
                    if (ge1.b.Y(new com.garmin.gfdi.file.c(file2, useCompression, aVar2, i15, pVar, null), this) == aVar) {
                        return aVar;
                    }
                    file = file2;
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    file = (File) this.L$0;
                    r.b(obj);
                }
                this.$listener.b(file, String.valueOf(this.$fileIndex));
            } catch (FileException e4) {
                f.c cVar2 = this.$listener;
                String strValueOf = String.valueOf(this.$fileIndex);
                String message = e4.getMessage();
                if (message == null) {
                    message = "Operation failed";
                }
                cVar2.c(strValueOf, message);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gfdi.framework.FileManagerCompat$resolveGarminDeviceFileType$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.gfdi.framework.FileManagerCompat$resolveGarminDeviceFileType$1", f = "FileManagerCompat.kt", l = {187}, m = "invokeSuspend")
    public static final class C38961 extends i implements p<b0, t13.d<? super String>, Object> {
        final /* synthetic */ int $fileSubType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38961(int i14, t13.d<? super C38961> dVar) {
            super(2, dVar);
            this.$fileSubType = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return FileManagerCompat.this.new C38961(this.$fileSubType, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super String> dVar) {
            return ((C38961) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object next;
            int i14;
            Object next2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.label;
            if (i15 == 0) {
                r.b(obj);
                FileManagerCompat fileManagerCompat = FileManagerCompat.this;
                this.label = 1;
                obj = fileManagerCompat.getSupportedFileTypes(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            List list = (List) obj;
            int i16 = this.$fileSubType;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((ws2.a) next).f186956b != i16);
            ws2.a aVar2 = (ws2.a) next;
            String str = aVar2 != null ? aVar2.f186957c : null;
            if (str != null || (i14 = this.$fileSubType) >= 0) {
                return str;
            }
            int i17 = i14 & 255;
            Iterator it3 = list.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (((ws2.a) next2).f186956b != i17);
            ws2.a aVar3 = (ws2.a) next2;
            if (aVar3 != null) {
                return aVar3.f186957c;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gfdi.framework.FileManagerCompat$saveFile$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.gfdi.framework.FileManagerCompat$saveFile$1", f = "FileManagerCompat.kt", l = {145}, m = "invokeSuspend")
    public static final class C38971 extends i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ String $absoluteFilePathInRemoteDevice;
        final /* synthetic */ boolean $allowCompression;
        final /* synthetic */ byte $dataSubType;
        final /* synthetic */ byte $dataType;
        final /* synthetic */ String $itemId;
        final /* synthetic */ SyncDownloadCapability.ResultListener $listener;
        final /* synthetic */ File $sourceFile;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38971(String str, File file, byte b14, byte b15, String str2, boolean z14, SyncDownloadCapability.ResultListener resultListener, t13.d<? super C38971> dVar) {
            super(2, dVar);
            this.$absoluteFilePathInRemoteDevice = str;
            this.$sourceFile = file;
            this.$dataType = b14;
            this.$dataSubType = b15;
            this.$itemId = str2;
            this.$allowCompression = z14;
            this.$listener = resultListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(SyncDownloadCapability.ResultListener resultListener, String str, int i14, int i15) {
            resultListener.b(i14, str);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return FileManagerCompat.this.new C38971(this.$absoluteFilePathInRemoteDevice, this.$sourceFile, this.$dataType, this.$dataSubType, this.$itemId, this.$allowCompression, this.$listener, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C38971) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v0, types: [com.garmin.android.gfdi.framework.c] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th3;
            C38971 c38971;
            FileException fileException;
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    try {
                        FileManagerCompat.this.currentAbsoluteFilePath = this.$absoluteFilePathInRemoteDevice;
                        com.garmin.gfdi.file.a aVar = FileManagerCompat.this.fileManager;
                        File file = this.$sourceFile;
                        byte b14 = this.$dataType;
                        byte[] bArr = {this.$dataSubType, 0, 0};
                        String str = this.$absoluteFilePathInRemoteDevice;
                        long j8 = Long.parseLong(this.$itemId);
                        boolean z14 = this.$allowCompression;
                        final SyncDownloadCapability.ResultListener resultListener = this.$listener;
                        final String str2 = this.$itemId;
                        ?? r14 = new p() { // from class: com.garmin.android.gfdi.framework.c
                            @Override // e23.p
                            public final Object invoke(Object obj3, Object obj4) {
                                return FileManagerCompat.C38971.invokeSuspend$lambda$0(resultListener, str2, ((Integer) obj3).intValue(), ((Integer) obj4).intValue());
                            }
                        };
                        this.label = 1;
                        aVar.getClass();
                        c38971 = this;
                        try {
                            Object objI = aVar.i(new ys2.f(file), b14, bArr, str, j8, z14, r14, c38971);
                            if (objI != obj2) {
                                objI = Unit.INSTANCE;
                            }
                            if (objI == obj2) {
                                return obj2;
                            }
                        } catch (FileException e4) {
                            e = e4;
                            fileException = e;
                            c38971.$listener.c(c38971.$itemId, fileException);
                        }
                    } catch (FileException e14) {
                        e = e14;
                        c38971 = this;
                        fileException = e;
                        c38971.$listener.c(c38971.$itemId, fileException);
                    } catch (Throwable th4) {
                        th = th4;
                        th3 = th;
                        FileManagerCompat.this.currentAbsoluteFilePath = null;
                        throw th3;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    try {
                        r.b(obj);
                        c38971 = this;
                    } catch (FileException e15) {
                        fileException = e15;
                        c38971 = this;
                        c38971.$listener.c(c38971.$itemId, fileException);
                    } catch (Throwable th5) {
                        th3 = th5;
                        FileManagerCompat.this.currentAbsoluteFilePath = null;
                        throw th3;
                    }
                }
                c38971.$listener.a(c38971.$itemId);
                FileManagerCompat.this.currentAbsoluteFilePath = null;
                return Unit.INSTANCE;
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    public FileManagerCompat(com.garmin.gfdi.file.a aVar, rs2.c cVar) {
        aVar.getClass();
        cVar.getClass();
        this.fileManager = aVar;
        this.deviceInfo = cVar;
        this.defaultReadOptions = DEFAULT_FILE_READ_OPTIONS;
        this.lock = new byte[0];
        ge1.b.T(e1.f129333a, null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getSupportedFileTypes(t13.d<? super List<ws2.a>> dVar) {
        C38921 c38921;
        List<ws2.a> list;
        if (dVar instanceof C38921) {
            c38921 = (C38921) dVar;
            int i14 = c38921.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c38921.label = i14 - Integer.MIN_VALUE;
            } else {
                c38921 = new C38921(dVar);
            }
        } else {
            c38921 = new C38921(dVar);
        }
        Object objE = c38921.result;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c38921.label;
        try {
            if (i15 == 0) {
                r.b(objE);
                synchronized (this.lock) {
                    list = this.supportedFileTypes;
                }
                if (list != null) {
                    return list;
                }
                com.garmin.gfdi.file.a aVar2 = this.fileManager;
                c38921.label = 1;
                objE = aVar2.e(c38921);
                if (objE == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objE);
            }
            List<ws2.a> list2 = (List) objE;
            synchronized (this.lock) {
                this.supportedFileTypes = list2;
                Unit unit = Unit.INSTANCE;
            }
            return list2;
        } catch (Exception unused) {
            return j0.f134944a;
        }
    }

    public final void archive(int fileIndex, f.a listener) {
        listener.getClass();
        ge1.b.T(e1.f129333a, null, null, new C38901(fileIndex, listener, null), 3);
    }

    public final List<Byte> getSupportedFileSubTypes() {
        return (List) ge1.b.W(t13.h.f161748a, new C38911(null));
    }

    public final boolean isFileUploadInProgress(int fileIndex) {
        return fileIndex == 2 && this.currentAbsoluteFilePath != null;
    }

    public final void listFiles(byte filterType, byte[] fileSubTypeFilters, f.b listener) {
        ws2.b bVar;
        listener.getClass();
        if (filterType == 0) {
            bVar = ws2.b.NO_FILTER;
        } else if (filterType == 1) {
            bVar = ws2.b.DEFAULT;
        } else {
            if (filterType != 3) {
                String strH = j.h(filterType, "Invalid filter: ");
                wb2.b0 b0Var = wb2.b0.this;
                b0Var.getClass();
                b0Var.K(v.c.FAILED_REMOTE_DEVICE_EXCEPTION, wb2.h.REMOTE_DEVICE_EXCEPTION, strH, "Failed to get directory from device", null);
                b0Var.w(strH);
                return;
            }
            bVar = ws2.b.PENDING_UPLOADS_ONLY;
        }
        ge1.b.T(e1.f129333a, null, null, new C38931(bVar, listener, fileSubTypeFilters, null), 3);
    }

    public final void readDeviceXml(f.d listener) {
        listener.getClass();
        ge1.b.T(e1.f129333a, null, null, new C38941(listener, null), 3);
    }

    public final void readFile(int fileIndex, String destFileDir, String destFileName, f.c listener) {
        destFileDir.getClass();
        listener.getClass();
        ge1.b.T(e1.f129333a, null, null, new C38951(destFileName, fileIndex, destFileDir, listener, null), 3);
    }

    public final String resolveGarminDeviceFileType(int fileSubType) {
        return (String) ge1.b.W(t13.h.f161748a, new C38961(fileSubType, null));
    }

    public final void saveFile(String itemId, File sourceFile, byte dataType, byte dataSubType, String absoluteFilePathInRemoteDevice, boolean allowCompression, SyncDownloadCapability.ResultListener listener) {
        if (listener == null || sourceFile == null || itemId == null) {
            return;
        }
        ge1.b.T(e1.f129333a, null, null, new C38971(absoluteFilePathInRemoteDevice, sourceFile, dataType, dataSubType, itemId, allowCompression, listener, null), 3);
    }

    @Override // com.garmin.android.gfdi.filetransfer.FileManagerCapability
    public void setDefaultFileReadOptions(FileManagerCapability.FileReadOptions options) {
        options.getClass();
        this.defaultReadOptions = options;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/garmin/android/gfdi/framework/FileManagerCompat$Companion;", "", "<init>", "()V", "DEFAULT_FILE_READ_OPTIONS", "Lcom/garmin/android/gfdi/filetransfer/FileManagerCapability$FileReadOptions;", "getDEFAULT_FILE_READ_OPTIONS$garmin_fitness_device_interface_release", "()Lcom/garmin/android/gfdi/filetransfer/FileManagerCapability$FileReadOptions;", "FILTER_TYPE_PENDING_UPLOADS", "", "FILTER_TYPE_NO_FILTER", "GARMIN_DEVICE_XML_FILE_INDEX", "", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final FileManagerCapability.FileReadOptions getDEFAULT_FILE_READ_OPTIONS$garmin_fitness_device_interface_release() {
            return FileManagerCompat.DEFAULT_FILE_READ_OPTIONS;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gfdi.framework.FileManagerCompat$getSupportedFileSubTypes$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.gfdi.framework.FileManagerCompat$getSupportedFileSubTypes$1", f = "FileManagerCompat.kt", l = {180}, m = "invokeSuspend")
    public static final class C38911 extends i implements p<b0, t13.d<? super List<? extends Byte>>, Object> {
        int label;

        public C38911(t13.d<? super C38911> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return FileManagerCompat.this.new C38911(dVar);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(b0 b0Var, t13.d<? super List<Byte>> dVar) {
            return ((C38911) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                FileManagerCompat fileManagerCompat = FileManagerCompat.this;
                this.label = 1;
                obj = fileManagerCompat.getSupportedFileTypes(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(y.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(Byte.valueOf((byte) ((ws2.a) it.next()).f186956b));
            }
            return arrayList;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Object invoke(b0 b0Var, t13.d<? super List<? extends Byte>> dVar) {
            return invoke2(b0Var, (t13.d<? super List<Byte>>) dVar);
        }
    }
}
