package com.garmin.android.apps.connectmobile.group.service.model;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/service/model/b;", "", "", Action.KEY_ATTRIBUTE, "", "iconResourceId", "nameResourceId", "", "isChecked", "<init>", "(Ljava/lang/String;ILjava/lang/String;IIZ)V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum b {
    RUNNING("running", R.drawable.run, R.string.lbl_running, false),
    ROAD_CYCLING("road_cycling", R.drawable.bike, R.string.lbl_road_biking, false),
    MOUNTAIN_CYCLING("mountain_cycling", R.drawable.mountain_bike, R.string.lbl_mountain_biking, false),
    SWIMMING("swimming", R.drawable.swim_pool, R.string.lbl_swimming, false),
    TRIATHLON("triathlon", R.drawable.three_sport, R.string.lbl_triathlon, false),
    /* JADX INFO: Fake field, exist only in values array */
    DUATHLON("duathlon", R.drawable.two_sport, R.string.lbl_duathlon, false),
    WALKING("walking", R.drawable.walk, R.string.device_cat_wellness, false),
    /* JADX INFO: Fake field, exist only in values array */
    HIKING("hiking", R.drawable.hike, R.string.lbl_hiking, false),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_TRAINING("cross_training", R.drawable.cardio, R.string.lbl_cross_training, false),
    /* JADX INFO: Fake field, exist only in values array */
    TRAINING("weight_training", R.drawable.strength, R.string.lbl_training, false),
    /* JADX INFO: Fake field, exist only in values array */
    SNOW_SPORTS("snow_sports", R.drawable.ski, R.string.lbl_snow_sports, false),
    /* JADX INFO: Fake field, exist only in values array */
    WATER_SPORTS("water_sports", R.drawable.water_sports, R.string.lbl_water_sports, false),
    GOLF("golf", R.drawable.golf, R.string.lbl_golf, false),
    PARASPORTS("para_sports", R.drawable.activity_default_para, R.string.activity_type_parasports, false),
    OTHER("other", R.drawable.other_activity, R.string.lbl_other, false);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36409b;

    static {
        new a(null);
    }

    b(String str, int i14, int i15, boolean z14) {
        this.f36408a = i14;
        this.f36409b = i15;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/service/model/b$a;", "", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
