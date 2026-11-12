package com.xiaomi.hm.health.traininglib.event;

import android.os.Bundle;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourse;
import com.xiaomi.hm.health.databases.model.trainning.TrainingDetail;
import com.xiaomi.hm.health.databases.model.trainning.TrainingItem;
import com.xiaomi.hm.health.traininglib.model.RecyclePopupItem;
import com.xiaomi.hm.health.traininglib.model.RunCirclePosts;
import com.xiaomi.hm.health.traininglib.model.TrainingArticle;
import com.xiaomi.hm.health.traininglib.model.TrainingBanner;
import com.xiaomi.hm.health.traininglib.model.TrainingHistoryDetail;
import com.xiaomi.hm.health.traininglib.model.TrainingHistoryListData;
import com.xiaomi.hm.health.traininglib.model.TrainingKnowledge;
import com.xiaomi.hm.health.traininglib.model.TrainingStatInfo;
import com.xiaomi.hm.health.traininglib.model.TrainingSubject;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class EventReqTrainingData {
    public static final int RESULT_CANCEL = 2;
    public static final int RESULT_ERROR = 1;
    public static final int RESULT_SUCCESS = 0;
    public Bundle extraData;
    public int httpCancleType;
    public int method;
    public Object respData;
    public int resultFlag;
    public Throwable throwable;
    public static final MethodType DATA_TRAIN_MINE_LIST = new MethodType(17, new a().getType());
    public static final MethodType DATA_TRAIN_ALL_LIST = new MethodType(18, new b().getType());
    public static final MethodType DATA_TRAIN_DETAIL = new MethodType(20, TrainingDetail.class);
    public static final MethodType DATA_SUBJECT_LIST = new MethodType(21, new c().getType());
    public static final MethodType DATA_TRAIN_ARTICLE_LIST = new MethodType(25, new d().getType());
    public static final MethodType DATA_TRAIN_BANNER_LIST = new MethodType(32, new e().getType());
    public static final MethodType DATA_TRAINING_DICTIONARIES_LIST = new MethodType(33, new f().getType());
    public static final MethodType DATA_TRAIN_COLLECTION_LIST = new MethodType(34, new g().getType());
    public static final MethodType DATA_JOIN_TRAININGS = new MethodType(35, null);
    public static final MethodType DATA_TRAINING_RUNCIRCLEPOSTS = new MethodType(36, new h().getType());
    public static final MethodType DATA_TRAINING_PLAN = new MethodType(37, TrainingCourse.class);
    public static final MethodType DATA_TRAINING_KNOWLEDGE = new MethodType(38, new i().getType());
    public static final MethodType DATA_TRAINING_PLANS = new MethodType(39, null);
    public static final MethodType DATA_TRAINING_HISTORY_LIST = new MethodType(40, TrainingHistoryListData.class);
    public static final MethodType DATA_TRAINING_HISTORY_DETAIL = new MethodType(41, TrainingHistoryDetail.class);
    public static final MethodType DATA_TRAINING_PLAN_VIEWDETAIL = new MethodType(48, TrainingCourse.class);
    public static final MethodType DATA_TRAINING_HISTORY_STAT = new MethodType(49, TrainingStatInfo.class);
    public static final MethodType DATA_TRAINING_PLANS_EXIT = new MethodType(50, null);
    public static final MethodType DATA_TRAINING_FINISH = new MethodType(51, TrainingCourse.class);

    public static final class MethodType {
        public int method;
        public Type type;

        public MethodType(int i, Type type) {
            this.method = i;
            this.type = type;
        }
    }

    public class a extends TypeToken<List<TrainingItem>> {
    }

    public class b extends TypeToken<List<TrainingItem>> {
    }

    public class c extends TypeToken<List<TrainingSubject>> {
    }

    public class d extends TypeToken<List<TrainingArticle>> {
    }

    public class e extends TypeToken<List<TrainingBanner>> {
    }

    public class f extends TypeToken<List<RecyclePopupItem>> {
    }

    public class g extends TypeToken<List<TrainingItem>> {
    }

    public class h extends TypeToken<List<RunCirclePosts>> {
    }

    public class i extends TypeToken<List<TrainingKnowledge>> {
    }

    public EventReqTrainingData(int i2, Object obj) {
        this.method = i2;
        this.respData = obj;
    }

    public EventReqTrainingData(int i2, Object obj, Bundle bundle) {
        this(i2, obj);
        this.extraData = bundle;
    }

    public EventReqTrainingData(int i2, Throwable th, int i3) {
        this.method = i2;
        this.throwable = th;
        this.resultFlag = i3;
    }

    public EventReqTrainingData(int i2, int i3, int i4) {
        this.method = i2;
        this.httpCancleType = i3;
        this.resultFlag = i4;
    }
}
