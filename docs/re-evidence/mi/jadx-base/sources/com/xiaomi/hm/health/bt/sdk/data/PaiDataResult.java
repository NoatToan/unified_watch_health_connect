package com.xiaomi.hm.health.bt.sdk.data;

import com.xiaomi.hm.health.bt.model.UserInfoExt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public class PaiDataResult implements Serializable {
    private static final long serialVersionUID = 1;
    private ArrayList<PaiData> list;
    private UserInfoExt userInfoExt;

    public ArrayList<PaiData> getList() {
        return this.list;
    }

    public String getResult() {
        JSONArray jSONArray = new JSONArray();
        ArrayList<PaiData> arrayList = this.list;
        if (arrayList == null || arrayList.size() == 0) {
            return jSONArray.toString();
        }
        ArrayList<PaiData> arrayList2 = this.list;
        long time = arrayList2.get(arrayList2.size() - 1).getTime();
        Iterator<PaiData> it = this.list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getItemJson(this.userInfoExt, time / 1000));
        }
        return jSONArray.toString();
    }

    public void setList(ArrayList<PaiData> arrayList) {
        this.list = arrayList;
    }

    public void setUserInfoExt(UserInfoExt userInfoExt) {
        this.userInfoExt = userInfoExt;
    }
}
