package defpackage;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.miui.tsmclient.common.net.ResponseListener;
import com.miui.tsmclient.common.net.request.SecureRequest;
import com.miui.tsmclient.entity.ActionToken;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.OrderResponseInfo;
import com.miui.tsmclient.entity.PayableCardInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.pay.OrderInfo;
import com.miui.tsmclient.util.DeviceUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class tis extends SecureRequest<OrderResponseInfo> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CardInfo f34751b;

    public tis(Context context, PayableCardInfo payableCardInfo, ResponseListener<OrderResponseInfo> responseListener) {
        super("POST", TSMAuthContants.URL_START_TRANSFER_IN, OrderResponseInfo.class, responseListener);
        this.f34751b = payableCardInfo;
        OrderInfo transferInOrder = payableCardInfo.getTransferInOrder();
        addParams("orderId", transferInOrder == null ? null : transferInOrder.mOrderId).addParams("deviceId", DeviceUtils.getDeviceId(context, payableCardInfo)).addParams("deviceModel", DeviceUtils.getDeviceModel(payableCardInfo));
    }

    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public void addExtraParams() throws IOException {
        try {
            addParams("cplc", this.f34751b.getTerminal().getCPLC());
        } catch (IOException | InterruptedException e) {
            throw new IOException("StartTransferInRequest getExtraParams failed", e);
        }
    }

    @Override // com.miui.tsmclient.common.net.request.GsonRequest
    public Gson getGson() {
        return new GsonBuilder().registerTypeAdapter(OrderInfo.OrderStatus.class, new OrderInfo.OrderStatusDeserializer()).registerTypeAdapter(ActionToken.TokenType.class, new ActionToken.TokenTypeDeserializer()).create();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.miui.tsmclient.common.net.request.SecureRequest, com.miui.tsmclient.common.net.request.BaseSecureRequest, com.miui.tsmclient.common.net.request.BaseRequest
    public boolean isSuccess() {
        return super.isSuccess() && ((OrderResponseInfo) getResult()).getOrderInfo() != null;
    }
}
