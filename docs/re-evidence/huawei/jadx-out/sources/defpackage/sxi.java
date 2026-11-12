package defpackage;

import com.google.gson.JsonSyntaxException;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.runcard.operation.recommendalgo.model.SportLevel;
import com.huawei.up.model.UserInfomation;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class sxi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f48787b = 0.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f48788c;

    public SportLevel e(List<HiHealthData> list, UserInfomation userInfomation) {
        if (userInfomation == null) {
            LogUtil.j("Track_RunHistoryToSportLevel", "calSportLevel userInfomation is null");
            return new SportLevel(-1, 1);
        }
        int gender = userInfomation.getGender();
        if (gender != 0 && gender != 1) {
            LogUtil.j("Track_RunHistoryToSportLevel", "undefined gender");
            return new SportLevel(-1, 2);
        }
        d(list);
        return c(gender);
    }

    private void d(List<HiHealthData> list) {
        LogUtil.a("Track_RunHistoryToSportLevel", "analyzeTrackSimplifyData");
        if (list == null) {
            LogUtil.a("Track_RunHistoryToSportLevel", "analyzeTrackSimplifyData datas is null");
            this.f48788c = 0.0d;
        }
        if (njy.b(list)) {
            int i = 0;
            long totalTime = 0;
            double totalDistance = 0.0d;
            for (HiHealthData hiHealthData : list) {
                if (hiHealthData == null) {
                    LogUtil.a("Track_RunHistoryToSportLevel", "analyzeTrackSimplifyData hiHealthData is null");
                } else {
                    String metaData = hiHealthData.getMetaData();
                    if (metaData == null) {
                        LogUtil.a("Track_RunHistoryToSportLevel", "metaData is null");
                    } else {
                        try {
                            HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(metaData, HiTrackMetaData.class);
                            if (hiTrackMetaData.getDuplicated() == 0 && hiTrackMetaData.getAbnormalTrack() == 0) {
                                totalDistance += (double) hiTrackMetaData.getTotalDistance();
                                i++;
                                totalTime += hiTrackMetaData.getTotalTime();
                            }
                        } catch (JsonSyntaxException unused) {
                            LogUtil.j("Track_RunHistoryToSportLevel", "analyzeTrackSimplifyData trackMetaData is jsonSyntaxException");
                        }
                    }
                }
            }
            if (i > 0) {
                this.f48788c = totalDistance / ((double) i);
                if (totalDistance > 0.0d) {
                    this.f48787b = totalTime / totalDistance;
                } else {
                    this.f48787b = 0.0d;
                }
            } else {
                this.f48788c = 0.0d;
            }
            LogUtil.a("Track_RunHistoryToSportLevel", "analyzeTrackSimplifyData sum=", Double.valueOf(totalDistance), " count=", Integer.valueOf(i), " duration =", Long.valueOf(totalTime));
        }
    }

    private SportLevel e(double d) {
        if (d >= 573.0d) {
            return new SportLevel(0, 7, d);
        }
        if (d >= 522.0d) {
            return new SportLevel(1, 7, d);
        }
        if (d >= 467.0d) {
            return new SportLevel(2, 7, d);
        }
        if (d >= 418.0d) {
            return new SportLevel(3, 7, d);
        }
        if (d >= 384.0d) {
            return new SportLevel(4, 7, d);
        }
        if (d >= 0.0d) {
            return new SportLevel(5, 7, d);
        }
        return new SportLevel(-1, 0, d);
    }

    private SportLevel d(double d) {
        if (d >= 500.0d) {
            return new SportLevel(0, 7, d);
        }
        if (d >= 450.0d) {
            return new SportLevel(1, 7, d);
        }
        if (d >= 396.0d) {
            return new SportLevel(2, 7, d);
        }
        if (d >= 354.0d) {
            return new SportLevel(3, 7, d);
        }
        if (d >= 321.0d) {
            return new SportLevel(4, 7, d);
        }
        if (d >= 0.0d) {
            return new SportLevel(5, 7, d);
        }
        return new SportLevel(-1, 0, d);
    }

    public SportLevel c(int i) {
        double d = this.f48788c;
        if (d < 1.0d) {
            return new SportLevel(-1, 4);
        }
        if (d < 2000.0d) {
            return new SportLevel(0, 6, d);
        }
        return e(this.f48787b, i);
    }

    private SportLevel e(double d, int i) {
        if (i == 1) {
            return e(d);
        }
        if (i == 0) {
            return d(d);
        }
        return new SportLevel(-1, 0);
    }
}
