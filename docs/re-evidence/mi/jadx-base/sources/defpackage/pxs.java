package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.routepoisearch.RoutePOIItem;
import com.amap.api.services.routepoisearch.RoutePOISearch;
import com.amap.api.services.routepoisearch.RoutePOISearchQuery;
import com.amap.api.services.routepoisearch.RoutePOISearchResult;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class pxs extends kts<RoutePOISearchQuery, RoutePOISearchResult> {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30888a;

        static {
            int[] iArr = new int[RoutePOISearch.RoutePOISearchType.values().length];
            f30888a = iArr;
            try {
                iArr[RoutePOISearch.RoutePOISearchType.TypeGasStation.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30888a[RoutePOISearch.RoutePOISearchType.TypeMaintenanceStation.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30888a[RoutePOISearch.RoutePOISearchType.TypeATM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30888a[RoutePOISearch.RoutePOISearchType.TypeToilet.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30888a[RoutePOISearch.RoutePOISearchType.TypeFillingStation.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30888a[RoutePOISearch.RoutePOISearchType.TypeServiceArea.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30888a[RoutePOISearch.RoutePOISearchType.TypeChargeStation.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30888a[RoutePOISearch.RoutePOISearchType.TypeFood.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30888a[RoutePOISearch.RoutePOISearchType.TypeHotel.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public pxs(Context context, RoutePOISearchQuery routePOISearchQuery) {
        super(context, routePOISearchQuery);
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return wts.b() + "/place/route?";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts
    public final String q() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(e0t.k(this.v));
        stringBuffer.append("&range=");
        StringBuilder sb = new StringBuilder();
        sb.append(((RoutePOISearchQuery) this.s).getRange());
        stringBuffer.append(sb.toString());
        String str = "";
        try {
            switch (a.f30888a[((RoutePOISearchQuery) this.s).getSearchType().ordinal()]) {
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
                    str = "100000";
                    break;
            }
        } catch (Exception unused) {
        }
        if (((RoutePOISearchQuery) this.s).getPolylines() == null || ((RoutePOISearchQuery) this.s).getPolylines().size() <= 0) {
            stringBuffer.append("&origin=");
            stringBuffer.append(xts.d(((RoutePOISearchQuery) this.s).getFrom()));
            stringBuffer.append("&destination=");
            stringBuffer.append(xts.d(((RoutePOISearchQuery) this.s).getTo()));
            stringBuffer.append("&strategy=");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(((RoutePOISearchQuery) this.s).getMode());
            stringBuffer.append(sb2.toString());
        } else {
            stringBuffer.append("&polyline=");
            stringBuffer.append(xts.f(((RoutePOISearchQuery) this.s).getPolylines()));
        }
        String channel = ((RoutePOISearchQuery) this.s).getChannel();
        if (!TextUtils.isEmpty(channel)) {
            stringBuffer.append("&channel=");
            stringBuffer.append(channel);
        }
        stringBuffer.append("&types=");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kts, com.amap.api.col.p0003sl.u
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final RoutePOISearchResult e(String str) throws AMapException {
        ArrayList<RoutePOIItem> arrayList = new ArrayList<>();
        try {
            arrayList = fvs.w0(new JSONObject(str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new RoutePOISearchResult(arrayList, (RoutePOISearchQuery) this.s);
    }
}
