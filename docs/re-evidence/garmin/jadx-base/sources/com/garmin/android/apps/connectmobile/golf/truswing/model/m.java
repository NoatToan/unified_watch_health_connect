package com.garmin.android.apps.connectmobile.golf.truswing.model;

import com.garmin.android.apps.connectmobile.s1;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/golf/truswing/model/m;", "Lcom/garmin/android/apps/connectmobile/s1;", "", "pageNumber", "rowsPerPage", "Ljava/util/ArrayList;", "Lcom/garmin/android/apps/connectmobile/golf/truswing/model/SwingSessionDTO;", "Lkotlin/collections/ArrayList;", "swingSessionsForUser", "totalRows", "<init>", "(IILjava/util/ArrayList;I)V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<SwingSessionDTO> f35980a;

    public /* synthetic */ m(int i14, int i15, ArrayList arrayList, int i16, int i17, p005kotlin.jvm.internal.j jVar) {
        this((i17 & 1) != 0 ? 1 : i14, (i17 & 2) != 0 ? 20 : i15, (i17 & 4) != 0 ? new ArrayList() : arrayList, (i17 & 8) != 0 ? 0 : i16);
    }

    @Override // com.garmin.android.apps.connectmobile.s1
    public final void k(JSONObject jSONObject) {
        ArrayList<SwingSessionDTO> arrayList;
        if (jSONObject != null) {
            jSONObject.optInt("pageNumber");
            jSONObject.optInt("rowsPerPage");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("swingSessionsForUser");
            if (jSONArrayOptJSONArray == null) {
                arrayList = new ArrayList<>();
            } else {
                ArrayList<SwingSessionDTO> arrayList2 = new ArrayList<>();
                int length = jSONArrayOptJSONArray.length();
                for (int i14 = 0; i14 < length; i14++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i14);
                    SwingSessionDTO swingSessionDTO = new SwingSessionDTO();
                    swingSessionDTO.k(jSONObjectOptJSONObject);
                    arrayList2.add(swingSessionDTO);
                }
                arrayList = arrayList2;
            }
            this.f35980a = arrayList;
            jSONObject.optInt("totalRows");
        }
    }

    public m(int i14, int i15, ArrayList<SwingSessionDTO> arrayList, int i16) {
        arrayList.getClass();
        this.f35980a = arrayList;
    }

    public m() {
        this(0, 0, null, 0, 15, null);
    }
}
