package com.amap.api.services.district;

import android.content.Context;
import com.amap.api.col.p0003sl.hr;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IDistrictSearch;

/* JADX INFO: loaded from: classes4.dex */
public class DistrictSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IDistrictSearch f3560a;

    public interface OnDistrictSearchListener {
        void onDistrictSearched(DistrictResult districtResult);
    }

    public DistrictSearch(Context context) throws AMapException {
        if (this.f3560a == null) {
            try {
                this.f3560a = new hr(context);
            } catch (Exception e) {
                e.printStackTrace();
                if (e instanceof AMapException) {
                    throw ((AMapException) e);
                }
            }
        }
    }

    public DistrictSearchQuery getQuery() {
        IDistrictSearch iDistrictSearch = this.f3560a;
        if (iDistrictSearch != null) {
            return iDistrictSearch.getQuery();
        }
        return null;
    }

    public void setQuery(DistrictSearchQuery districtSearchQuery) {
        IDistrictSearch iDistrictSearch = this.f3560a;
        if (iDistrictSearch != null) {
            iDistrictSearch.setQuery(districtSearchQuery);
        }
    }

    public DistrictResult searchDistrict() throws AMapException {
        IDistrictSearch iDistrictSearch = this.f3560a;
        if (iDistrictSearch != null) {
            return iDistrictSearch.searchDistrict();
        }
        return null;
    }

    public void searchDistrictAsyn() {
        IDistrictSearch iDistrictSearch = this.f3560a;
        if (iDistrictSearch != null) {
            iDistrictSearch.searchDistrictAsyn();
        }
    }

    public void searchDistrictAnsy() {
        IDistrictSearch iDistrictSearch = this.f3560a;
        if (iDistrictSearch != null) {
            iDistrictSearch.searchDistrictAnsy();
        }
    }

    public void setOnDistrictSearchListener(OnDistrictSearchListener onDistrictSearchListener) {
        IDistrictSearch iDistrictSearch = this.f3560a;
        if (iDistrictSearch != null) {
            iDistrictSearch.setOnDistrictSearchListener(onDistrictSearchListener);
        }
    }
}
