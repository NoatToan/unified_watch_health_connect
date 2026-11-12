package androidx.health.platform.client.error;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.platform.client.impl.data.ProtoParcelable;
import androidx.health.platform.client.impl.data.SharedMemory27Impl;
import androidx.health.platform.client.proto.ErrorProto;
import androidx.health.platform.client.proto.InvalidProtocolBufferException;
import defpackage.yyp;
import defpackage.yzp;
import defpackage.zcm;
import defpackage.zcp;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/health/platform/client/error/ErrorStatus;", "Landroidx/health/platform/client/impl/data/ProtoParcelable;", "Landroidx/health/platform/client/proto/ErrorProto$ErrorStatus;", "errorCode", "", "errorMessage", "", "<init>", "(ILjava/lang/String;)V", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "proto", "getProto", "()Landroidx/health/platform/client/proto/ErrorProto$ErrorStatus;", "proto$delegate", "Lkotlin/Lazy;", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ErrorStatus extends ProtoParcelable<ErrorProto.ErrorStatus> {
    public static final Parcelable.Creator<ErrorStatus> CREATOR;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int errorCode;
    private final String errorMessage;

    /* JADX INFO: renamed from: proto$delegate, reason: from kotlin metadata */
    private final Lazy proto;

    public /* synthetic */ ErrorStatus(int i, String str, int i2, zcm zcmVar) {
        this(i, (i2 & 2) != 0 ? null : str);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public ErrorStatus(@ErrorCode int i, String str) {
        this.errorCode = i;
        this.errorMessage = str;
        this.proto = yyp.c(new Function0<ErrorProto.ErrorStatus>() { // from class: androidx.health.platform.client.error.ErrorStatus$proto$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ErrorProto.ErrorStatus invoke() {
                ErrorProto.ErrorStatus.Builder code = ErrorProto.ErrorStatus.newBuilder().setCode(this.this$0.getErrorCode());
                String errorMessage = this.this$0.getErrorMessage();
                if (errorMessage != null) {
                    code.setMessage(errorMessage);
                }
                return code.build();
            }

            {
                super(0);
            }
        });
    }

    @Override // androidx.health.platform.client.impl.data.ProtoData
    public ErrorProto.ErrorStatus getProto() {
        Object value = this.proto.getValue();
        zcp.b(value, "");
        return (ErrorProto.ErrorStatus) value;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0007R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/health/platform/client/error/ErrorStatus$Companion;", "", "<init>", "()V", "create", "Landroidx/health/platform/client/error/ErrorStatus;", "errorCode", "", "errorMessage", "", "safeErrorCode", "CREATOR", "Landroid/os/Parcelable$Creator;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ ErrorStatus create$default(Companion companion, int i, String str, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                str = null;
            }
            return companion.create(i, str);
        }

        @JvmStatic
        public final ErrorStatus create(int errorCode, String errorMessage) {
            return new ErrorStatus(safeErrorCode(errorCode), errorMessage);
        }

        @ErrorCode
        public final int safeErrorCode(int errorCode) {
            Object obj;
            Field[] declaredFields = ErrorCode.class.getDeclaredFields();
            zcp.b((Object) declaredFields, "");
            ArrayList arrayList = new ArrayList();
            for (Field field : declaredFields) {
                if (field.getType().isAssignableFrom(Integer.TYPE)) {
                    arrayList.add(field);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(yzp.e(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (true) {
                obj = null;
                int iIntValue = 10007;
                if (!it.hasNext()) {
                    break;
                }
                try {
                    Object obj2 = ((Field) it.next()).get(null);
                    zcp.e(obj2, "");
                    iIntValue = ((Integer) obj2).intValue();
                } catch (IllegalAccessException unused) {
                }
                arrayList3.add(Integer.valueOf(iIntValue));
            }
            for (Object obj3 : arrayList3) {
                if (((Number) obj3).intValue() == errorCode) {
                    obj = obj3;
                    break;
                }
            }
            Integer num = (Integer) obj;
            if (num != null) {
                return num.intValue();
            }
            return 10007;
        }

        @JvmStatic
        public final ErrorStatus create(int i) {
            return create$default(this, i, null, 2, null);
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    static {
        ProtoParcelable.Companion companion = ProtoParcelable.INSTANCE;
        CREATOR = new Parcelable.Creator<ErrorStatus>() { // from class: androidx.health.platform.client.error.ErrorStatus$special$$inlined$newCreator$connect_client_release$1
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r5v8, types: [androidx.health.platform.client.error.ErrorStatus, androidx.health.platform.client.impl.data.ProtoParcelable] */
            @Override // android.os.Parcelable.Creator
            public ErrorStatus createFromParcel(Parcel source) throws InvalidProtocolBufferException {
                zcp.c(source, "");
                int i = source.readInt();
                if (i != 0) {
                    if (i == 1) {
                        return (ProtoParcelable) SharedMemory27Impl.INSTANCE.parseParcelUsingSharedMemory(source, new Function1<byte[], ErrorStatus>() { // from class: androidx.health.platform.client.error.ErrorStatus$special$$inlined$newCreator$connect_client_release$1.1
                            @Override // kotlin.jvm.functions.Function1
                            public final ErrorStatus invoke(byte[] bArr) throws InvalidProtocolBufferException {
                                zcp.c(bArr, "");
                                ErrorProto.ErrorStatus from = ErrorProto.ErrorStatus.parseFrom(bArr);
                                return ErrorStatus.INSTANCE.create(from.getCode(), from.hasMessage() ? from.getMessage() : null);
                            }
                        });
                    }
                    throw new IllegalArgumentException("Unknown storage: " + i);
                }
                byte[] bArrCreateByteArray = source.createByteArray();
                if (bArrCreateByteArray == null) {
                    return null;
                }
                ErrorProto.ErrorStatus from = ErrorProto.ErrorStatus.parseFrom(bArrCreateByteArray);
                return ErrorStatus.INSTANCE.create(from.getCode(), from.hasMessage() ? from.getMessage() : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public ErrorStatus[] newArray(int size) {
                return new ErrorStatus[size];
            }
        };
    }

    @JvmStatic
    public static final ErrorStatus create(int i, String str) {
        return INSTANCE.create(i, str);
    }

    @JvmStatic
    public static final ErrorStatus create(int i) {
        return INSTANCE.create(i);
    }
}
