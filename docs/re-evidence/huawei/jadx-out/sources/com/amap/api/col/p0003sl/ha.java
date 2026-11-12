package com.amap.api.col.p0003sl;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.routepoisearch.RoutePOIItem;
import com.amap.api.services.routepoisearch.RoutePOISearch;
import com.amap.api.services.routepoisearch.RoutePOISearchQuery;
import com.amap.api.services.routepoisearch.RoutePOISearchResult;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public final class ha extends fm<RoutePOISearchQuery, RoutePOISearchResult> {
    public ha(Context context, RoutePOISearchQuery routePOISearchQuery) {
        super(context, routePOISearchQuery);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    protected final String c() {
        String str;
        StringBuffer stringBuffer = new StringBuffer("key=");
        stringBuffer.append(il.f(this.i));
        StringBuffer stringBufferAppend = stringBuffer.append("&range=");
        StringBuilder sb = new StringBuilder();
        sb.append(((RoutePOISearchQuery) this.f2534b).getRange());
        stringBufferAppend.append(sb.toString());
        try {
            switch (AnonymousClass1.f2615a[((RoutePOISearchQuery) this.f2534b).getSearchType().ordinal()]) {
                case 1:
                    str = "010100";
                    break;
                case 2:
                    str = "030000";
                    break;
                case 3:
                    str = "160300";
                    break;
                case 4:
                    str = "200300";
                    break;
                case 5:
                    str = "010300";
                    break;
                case 6:
                    str = "180300";
                    break;
                case 7:
                    str = "011100";
                    break;
                case 8:
                    str = "050000";
                    break;
                case 9:
                    str = SmartMsgConstant.SHOW_METHOD_SMART_CARD;
                    break;
                default:
                    str = "";
                    break;
            }
        } catch (Exception unused) {
        }
        if (((RoutePOISearchQuery) this.f2534b).getPolylines() != null && ((RoutePOISearchQuery) this.f2534b).getPolylines().size() > 0) {
            stringBuffer.append("&polyline=").append(fu.a(((RoutePOISearchQuery) this.f2534b).getPolylines()));
        } else {
            stringBuffer.append("&origin=").append(fu.a(((RoutePOISearchQuery) this.f2534b).getFrom()));
            stringBuffer.append("&destination=").append(fu.a(((RoutePOISearchQuery) this.f2534b).getTo()));
            StringBuffer stringBufferAppend2 = stringBuffer.append("&strategy=");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(((RoutePOISearchQuery) this.f2534b).getMode());
            stringBufferAppend2.append(sb2.toString());
        }
        String channel = ((RoutePOISearchQuery) this.f2534b).getChannel();
        if (!TextUtils.isEmpty(channel)) {
            stringBuffer.append("&channel=").append(channel);
        }
        stringBuffer.append("&types=").append(str);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: com.amap.api.col.3sl.ha$1, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2615a;

        static {
            int[] iArr = new int[RoutePOISearch.RoutePOISearchType.values().length];
            f2615a = iArr;
            try {
                iArr[RoutePOISearch.RoutePOISearchType.TypeGasStation.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2615a[RoutePOISearch.RoutePOISearchType.TypeMaintenanceStation.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2615a[RoutePOISearch.RoutePOISearchType.TypeATM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2615a[RoutePOISearch.RoutePOISearchType.TypeToilet.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2615a[RoutePOISearch.RoutePOISearchType.TypeFillingStation.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2615a[RoutePOISearch.RoutePOISearchType.TypeServiceArea.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2615a[RoutePOISearch.RoutePOISearchType.TypeChargeStation.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2615a[RoutePOISearch.RoutePOISearchType.TypeFood.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2615a[RoutePOISearch.RoutePOISearchType.TypeHotel.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amap.api.col.p0003sl.fm, com.amap.api.col.p0003sl.fl
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public RoutePOISearchResult a(String str) throws AMapException {
        ArrayList<RoutePOIItem> arrayList = new ArrayList<>();
        try {
            arrayList = gc.k(new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new RoutePOISearchResult(arrayList, (RoutePOISearchQuery) this.f2534b);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return ft.a() + "/place/route?";
    }
}
