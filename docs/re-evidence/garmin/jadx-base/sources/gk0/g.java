package gk0;

import android.content.Context;
import android.text.TextUtils;
import com.garmin.android.framework.garminonline.query.InvalidRequestException;
import com.garmin.android.framework.garminonline.query.InvalidResponseException;
import com.garmin.android.framework.garminonline.query.TransactionStatusException;
import com.garmin.gcsprotos.generated.TransactionProto;
import com.google.firebase.perf.FirebasePerformance;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.util.List;
import o13.p;

/* JADX INFO: loaded from: classes8.dex */
public class g<T> extends eb2.a<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f<T> f77724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<p<String, String>> f77725j;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77726a;

        static {
            int[] iArr = new int[TransactionProto.TransactionStatus.values().length];
            f77726a = iArr;
            try {
                iArr[TransactionProto.TransactionStatus.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77726a[TransactionProto.TransactionStatus.AUTHENTICATION_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77726a[TransactionProto.TransactionStatus.MESSAGE_FORMAT_FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f77726a[TransactionProto.TransactionStatus.TOO_MANY_SERVICE_REQUESTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public g(Context context, f<T> fVar) {
        super(context, fVar);
        this.f77724i = fVar;
    }

    @Override // eb2.a
    public final Object b(InputStream inputStream) throws InvalidResponseException, TransactionStatusException {
        try {
            TransactionProto.TransactionResponse from = TransactionProto.TransactionResponse.parseFrom(inputStream);
            int i14 = a.f77726a[from.getTransactionStatus().ordinal()];
            if (i14 == 2) {
                throw new TransactionStatusException(999);
            }
            if (i14 == 3) {
                throw new InvalidResponseException(1);
            }
            if (i14 != 4) {
                return this.f77724i.a(from.getServiceResponseList());
            }
            throw new InvalidResponseException(1);
        } catch (IOException unused) {
            throw new InvalidResponseException(1);
        }
    }

    @Override // eb2.a
    public final T e() {
        this.f77724i.getClass();
        return (T) super.e();
    }

    @Override // eb2.a
    public final void f(OutputStream outputStream, eb2.e eVar) throws InvalidResponseException {
        try {
            TransactionProto.TransactionRequest.Builder builderNewBuilder = TransactionProto.TransactionRequest.newBuilder();
            if (this.f63678b) {
                builderNewBuilder.setClientTypeId(Integer.valueOf(eVar.f63691d).intValue());
                if (!TextUtils.isEmpty(eVar.f63692e)) {
                    builderNewBuilder.setGarminId(Long.parseLong(eVar.f63692e));
                }
                if (c() && !TextUtils.isEmpty(eVar.f63688a)) {
                    builderNewBuilder.setTransactionCount(eVar.f63689b);
                    builderNewBuilder.setTransactionKey(eVar.f63688a);
                }
            }
            if (!TextUtils.isEmpty(eVar.f63695h) || !TextUtils.isEmpty(eVar.f63693f) || !TextUtils.isEmpty(eVar.f63696i) || eVar.f63694g != -1) {
                TransactionProto.Device.Builder builderNewBuilder2 = TransactionProto.Device.newBuilder();
                if (!TextUtils.isEmpty(eVar.f63695h)) {
                    builderNewBuilder2.setFirmwareVersion(eVar.f63695h);
                }
                if (!TextUtils.isEmpty(eVar.f63693f)) {
                    builderNewBuilder2.setProductNumber(eVar.f63693f);
                }
                if (!TextUtils.isEmpty(eVar.f63696i)) {
                    builderNewBuilder2.setPairedAppVersion(eVar.f63696i);
                }
                long j8 = eVar.f63694g;
                if (j8 != -1) {
                    builderNewBuilder2.setUnitId(j8);
                }
                builderNewBuilder.setDevice(builderNewBuilder2);
            }
            builderNewBuilder.addAllServiceRequest(this.f77724i.prepare());
            builderNewBuilder.build().writeTo(outputStream);
        } catch (IOException unused) {
            throw new InvalidResponseException(1);
        }
    }

    @Override // eb2.a
    public final void g(eb2.a.b bVar, eb2.e eVar) throws InvalidRequestException {
        bVar.a("protocol", "proto");
        if (!this.f63678b) {
            bVar.a("appid", "GCS Client Test");
        }
        try {
            bVar.f63685a.setRequestMethod(FirebasePerformance.HttpMethod.POST);
            List<p<String, String>> list = this.f77725j;
            if (list == null || list.isEmpty()) {
                return;
            }
            for (int i14 = 0; i14 < list.size(); i14++) {
                bVar.a(list.get(i14).f128594a, list.get(i14).f128595b);
            }
        } catch (ProtocolException e4) {
            throw new InvalidRequestException(e4, 0);
        }
    }

    public g(Context context, f<T> fVar, List<p<String, String>> list) {
        this(context, fVar);
        this.f77725j = list;
    }
}
