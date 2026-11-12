package gk0;

import com.garmin.gcsprotos.generated.RequestTypesProto;
import com.garmin.gcsprotos.generated.ResponseTypesProto;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface f<T> extends eb2.d {
    T a(List<ResponseTypesProto.ServiceResponse> list);

    List<RequestTypesProto.ServiceRequest> prepare();
}
