package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.RemoteException;
import android.text.Editable;
import com.google.android.datatransport.Transformer;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.textfield.TextInputLayout;
import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.security.GeneralSecurityException;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class a implements ShapeAppearanceModel.CornerSizeUnaryOperator, TextInputLayout.LengthCounter, LibraryVersionComponent.VersionExtractor, OnFailureListener, Transformer, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53156a;

    public /* synthetic */ a(int i14) {
        this.f53156a = i14;
    }

    public static int a(int i14, int i15, int i16) {
        return zzlm.zzz(i14) + i15 + i16;
    }

    public static int b(int i14, int i15, int i16, int i17) {
        return CodedOutputStream.computeUInt32SizeNoTag(i14) + i15 + i16 + i17;
    }

    public static FieldDescriptor.Builder c(int i14, FieldDescriptor.Builder builder, String str) {
        com.google.android.gms.internal.mlkit_common.zzay zzayVar = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar.zza(i14);
        builder.withProperty(zzayVar.zzb()).build();
        return FieldDescriptor.builder(str);
    }

    public static FieldDescriptor d(int i14, FieldDescriptor.Builder builder) {
        com.google.android.gms.internal.mlkit_common.zzay zzayVar = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar.zza(i14);
        return builder.withProperty(zzayVar.zzb()).build();
    }

    public static Object e(zzbk zzbkVar, int i14, List list, int i15) {
        zzh.zza(zzbkVar.name(), i14, list);
        return list.get(i15);
    }

    public static String f(String str, StringBuilder sb3) {
        return str + ((Object) sb3);
    }

    public static void g(int i14, FieldDescriptor.Builder builder) {
        com.google.android.gms.internal.mlkit_common.zzay zzayVar = new com.google.android.gms.internal.mlkit_common.zzay();
        zzayVar.zza(i14);
        builder.withProperty(zzayVar.zzb()).build();
    }

    public static /* synthetic */ void h(int i14, Object obj, Object obj2, int i15) {
        StringBuilder sb3 = new StringBuilder(i14);
        sb3.append(obj);
        sb3.append(i15);
        sb3.append(obj2);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static /* synthetic */ void i(RemoteException remoteException) {
        throw new RuntimeRemoteException(remoteException);
    }

    public static void j(com.google.android.gms.measurement.internal.zzic zzicVar, String str) {
        zzicVar.zzaV().zzb().zza(str);
    }

    public static /* synthetic */ void k(Object obj, String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str + obj);
    }

    public static /* synthetic */ void l(String str) throws zzmr {
        throw new zzmr(str);
    }

    public static int m(int i14, int i15, int i16) {
        return com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn.zzA(i14) + i15 + i16;
    }

    public static FieldDescriptor.Builder n(int i14, FieldDescriptor.Builder builder, String str) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar.zza(i14);
        builder.withProperty(zzfaVar.zzb()).build();
        return FieldDescriptor.builder(str);
    }

    public static FieldDescriptor o(int i14, FieldDescriptor.Builder builder) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar.zza(i14);
        return builder.withProperty(zzfaVar.zzb()).build();
    }

    public static void p(int i14, FieldDescriptor.Builder builder) {
        com.google.android.gms.internal.mlkit_vision_barcode.zzfa zzfaVar = new com.google.android.gms.internal.mlkit_vision_barcode.zzfa();
        zzfaVar.zza(i14);
        builder.withProperty(zzfaVar.zzb()).build();
    }

    public static void q(com.google.android.gms.measurement.internal.zzic zzicVar, String str) {
        zzicVar.zzaV().zze().zza(str);
    }

    public static /* synthetic */ void r(String str) throws com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer {
        throw new com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzer(str);
    }

    public static FieldDescriptor s(int i14, FieldDescriptor.Builder builder) {
        com.google.android.gms.internal.mlkit_vision_common.zzae zzaeVar = new com.google.android.gms.internal.mlkit_vision_common.zzae();
        zzaeVar.zza(i14);
        return builder.withProperty(zzaeVar.zzb()).build();
    }

    public static /* synthetic */ void t(String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str);
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        return DataTransportCrashlyticsReportSender.lambda$static$0((CrashlyticsReport) obj);
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public int countLength(Editable editable) {
        return TextInputLayout.lambda$new$0(editable);
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        Context context = (Context) obj;
        switch (this.f53156a) {
            case 21:
                return FirebaseCommonRegistrar.lambda$getComponents$0(context);
            case 22:
                return FirebaseCommonRegistrar.lambda$getComponents$1(context);
            case 23:
                return FirebaseCommonRegistrar.lambda$getComponents$2(context);
            default:
                return FirebaseCommonRegistrar.lambda$getComponents$3(context);
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        FirebaseCrashlytics.lambda$init$0(exc);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f53156a) {
            case 28:
                return FcmBroadcastProcessor.lambda$startMessagingService$1(task);
            default:
                return FcmBroadcastProcessor.lambda$bindToMessagingService$3(task);
        }
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public CornerSize apply(CornerSize cornerSize) {
        return MaskableFrameLayout.lambda$setShapeAppearanceModel$0(cornerSize);
    }
}
