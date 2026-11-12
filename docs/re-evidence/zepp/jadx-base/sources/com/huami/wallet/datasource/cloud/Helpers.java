package com.huami.wallet.datasource.cloud;

import androidx.annotation.NonNull;
import com.huami.nfc.applet.TransType;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.bus.OrderEntity;
import com.huami.nfc.bus.OrderInfoEntity;
import com.huami.nfc.bus.PayType;
import com.huami.nfc.bus.XiaomiOrderInfoEntity;
import com.huami.wallet.lib.entity.MiOrder;
import com.huami.wallet.lib.entity.Order;
import com.huami.wallet.lib.entity.Resource;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class Helpers {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PayType.values().length];
            a = iArr;
            try {
                iArr[PayType.OpenAndCharge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[PayType.OpenCard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[PayType.Charge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[PayType.MoveOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[PayType.MoveIn.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static boolean a(@NonNull String str) {
        str.hashCode();
        return str.equals(Const.OrderStatus.DEDUCTED_BUT_OPEN_FAIL) || str.equals(Const.OrderStatus.DEDUCTED_BUT_RECHARGE_FAIL);
    }

    public static boolean b(@NonNull String str) {
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case 1507424:
                if (str.equals(Const.OrderStatus.DEDUCTED_BUT_OPEN_FAIL)) {
                    b = 0;
                }
                break;
            case 1507425:
                if (str.equals(Const.OrderStatus.DEDUCTED_BUT_RECHARGE_FAIL)) {
                    b = 1;
                }
                break;
            case 1507429:
                if (str.equals(Const.OrderStatus.DEDUCTED_BUT_NOT_HANDLE)) {
                    b = 2;
                }
                break;
            case 1507430:
                if (str.equals(Const.OrderStatus.DEDUCTED_BUT_NOT_CONFIRM)) {
                    b = 3;
                }
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public static boolean c(int i) {
        return i != 1;
    }

    public static boolean d(String str) {
        return Const.OrderStatus.DEDUCTED_BUT_OPEN_FAIL.equals(str) || Const.OrderStatus.DEDUCTED_BUT_RECHARGE_FAIL.equals(str);
    }

    public static boolean e(@NonNull String str) {
        return Const.OrderStatus.DEDUCTED_BUT_DOUBTFUL.equals(str);
    }

    public static String f(String str) {
        try {
            return new JSONObject(str).getString("msg");
        } catch (JSONException e) {
            e.printStackTrace();
            return "解析北京升级数据失败";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:62:0x00ed  */
    public static int g(String str) {
        if (str == null) {
            return -1;
        }
        switch (str) {
            case "SHIFT_UNAVAILABLE_LIMIT":
                return 10;
            case "SHIFT_UNAVAILABLE_LIMIT_MOT":
                return 11;
            case "SHIFT_UNAVAILABLE_LIMIT_LNT":
                return 12;
            case "SHIFT_UNAVAILABLE_SAME_BINDING":
                return 14;
            case "SHIFT_OUT_EXCEPTION":
                return 9;
            case "SHIFT_IN_EXCEPTION":
                return 13;
            case "SHIFT_IN":
                return 8;
            case "BINDING":
                return 1;
            case "UNOPENED":
                return 0;
            case "OFFLINE":
                return 3;
            case "EXCEPTION":
                return 2;
            case "UNAVAILABLE":
                return 4;
            case "UNAVAILABLE_LIMIT":
                return 5;
            case "UNAVAILABLE_LIMIT_LNT":
                return 7;
            case "UNAVAILABLE_LIMIT_MOT":
                return 6;
            case "RETURN_EXCEPTION":
                return 15;
            case "UNBINDING":
            case "RESET":
            default:
                return -1;
        }
    }

    public static int h(PayType payType, String str) {
        if (payType == null || str == null) {
            return 0;
        }
        switch (str) {
            case "0000":
                int i = a.a[payType.ordinal()];
                if (i == 1) {
                    return 1;
                }
                if (i != 2) {
                    return i != 3 ? 0 : 4;
                }
                return 10;
            case "1001":
                return 2;
            case "1002":
                int i2 = a.a[payType.ordinal()];
                if (i2 != 1) {
                    return i2 != 3 ? 0 : 5;
                }
                return 3;
            case "1004":
                return 7;
            case "1005":
                return 8;
            case "1006":
                int i3 = a.a[payType.ordinal()];
                if (i3 == 1) {
                    return 2;
                }
                if (i3 != 2) {
                    return i3 != 3 ? 0 : 5;
                }
                return 11;
            case "1007":
            case "1009":
                int i4 = a.a[payType.ordinal()];
                if (i4 != 1) {
                    return i4 != 3 ? 0 : 5;
                }
                return 3;
            case "1008":
                return 9;
            case "1010":
                return 14;
            case "1012":
                return 12;
            default:
                return 0;
        }
    }

    public static int i(PayType payType) {
        if (payType == null) {
            return 0;
        }
        int i = a.a[payType.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 3;
            if (i != 2) {
                if (i == 3) {
                    return 2;
                }
                int i3 = 4;
                if (i != 4) {
                    i3 = 5;
                    if (i != 5) {
                        return 0;
                    }
                }
                return i3;
            }
        }
        return i2;
    }

    public static Order j(OrderInfoEntity orderInfoEntity) {
        Order order = new Order();
        order.orderId = orderInfoEntity.getOrderNum();
        order.timestamp = orderInfoEntity.getTime() * 1000;
        order.amount = orderInfoEntity.getAmount();
        order.state = h(orderInfoEntity.getType(), orderInfoEntity.getStatus());
        order.type = i(orderInfoEntity.getType());
        order.canRetry = b(orderInfoEntity.getStatus());
        order.canRefund = a(orderInfoEntity.getStatus());
        order.needContactService = e(orderInfoEntity.getStatus());
        order.invoiceAuthCode = orderInfoEntity.getInvoiceAuthCode();
        order.codeValidDate = orderInfoEntity.getCodeValidDate();
        return order;
    }

    public static TransType k(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
                return TransType.IssueCard;
            case 4:
            case 5:
                return TransType.Charge;
            case 6:
            default:
                return null;
            case 7:
            case 8:
            case 9:
                return TransType.Refund;
        }
    }

    public static <T, R> Resource<R> l(PayResponse<T> payResponse) {
        return Resource.error(payResponse.getCode(), payResponse.getMessage(), null);
    }

    public static <T, R> Resource<R> m(PayResponse<T> payResponse, R r) {
        return Resource.error(payResponse.getCode(), payResponse.getMessage(), r);
    }

    public static MiOrder parseMiOrder(OrderEntity orderEntity) {
        MiOrder miOrder = new MiOrder();
        miOrder.orderId = orderEntity.getOrderNum();
        miOrder.payUrl = orderEntity.getPayUrl();
        miOrder.returnUrl = orderEntity.getReturnUrl();
        return miOrder;
    }

    public static Order parseXiaoMiOrder(XiaomiOrderInfoEntity xiaomiOrderInfoEntity) {
        PayType xiaomiOrderType = parseXiaomiOrderType(xiaomiOrderInfoEntity.getType());
        Order order = new Order();
        if (xiaomiOrderInfoEntity.getRichStatus() != null && !xiaomiOrderInfoEntity.getRichStatus().booleanValue()) {
            order.canRefundTwice = false;
        }
        order.canRefundTwice = xiaomiOrderInfoEntity.getRichStatus().booleanValue();
        order.orderId = xiaomiOrderInfoEntity.getOrderNum();
        order.timestamp = xiaomiOrderInfoEntity.getTimestamp() * 1000;
        order.amount = xiaomiOrderInfoEntity.getAmount();
        order.state = h(xiaomiOrderType, xiaomiOrderInfoEntity.getStatus());
        order.type = i(xiaomiOrderType);
        boolean zEquals = "0000".equals(xiaomiOrderInfoEntity.getStatus());
        order.canRetry = !zEquals;
        order.canRefund = !zEquals;
        order.needContactService = false;
        order.invoiceAuthCode = xiaomiOrderInfoEntity.getInvoiceAuthCode();
        order.codeValidDate = xiaomiOrderInfoEntity.getCodeValidDate();
        return order;
    }

    public static PayType parseXiaomiOrderType(int i) {
        if (i == 1) {
            return PayType.OpenCard;
        }
        if (i == 2) {
            return PayType.Charge;
        }
        if (i != 3) {
            return null;
        }
        return PayType.OpenAndCharge;
    }
}
