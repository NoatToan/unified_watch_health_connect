package com.huawei.ui.main.stories.fitness.activity.active;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.ui.main.R;
import defpackage.fsj;
import defpackage.lsl;
import defpackage.qre;
import defpackage.qrf;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes43.dex */
public class AchievePopMessageManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fsj f26498a;
    private int d;
    private final Context e;

    public AchievePopMessageManager(fsj fsjVar, Context context) {
        this.d = -1;
        this.f26498a = fsjVar;
        this.d = a();
        this.e = context;
    }

    public String d() {
        if (this.f26498a == null) {
            return "";
        }
        for (AchieveMessage achieveMessage : AchieveMessage.values()) {
            if (achieveMessage.getPriorityType() == this.d) {
                return achieveMessage.getTitle();
            }
        }
        return "";
    }

    public String e() {
        for (AchieveMessage achieveMessage : AchieveMessage.values()) {
            if (achieveMessage.getPriorityType() == this.d) {
                return achieveMessage.getContent();
            }
        }
        return "";
    }

    private int a() {
        fsj fsjVar = this.f26498a;
        if (fsjVar == null) {
            return -1;
        }
        float fB = fsjVar.b();
        int iC = this.f26498a.c();
        int iG = this.f26498a.g();
        int i = this.f26498a.i();
        int iP = this.f26498a.p();
        int iQ = this.f26498a.q();
        if (iC * 4 <= fB) {
            return 7;
        }
        if (i * 4 <= iG) {
            return 6;
        }
        if (iC * 3 <= fB) {
            return 5;
        }
        if (i * 3 <= iG) {
            return 4;
        }
        if (iC * 2 <= fB) {
            return 3;
        }
        if (i * 2 <= iG) {
            return 2;
        }
        return (fB < ((float) iC) || iG < i || iP < iQ) ? -1 : 1;
    }

    public String c() {
        for (AchieveMessage achieveMessage : AchieveMessage.values()) {
            if (achieveMessage.getPriorityType() == this.d) {
                return achieveMessage.getSpKey();
            }
        }
        return "";
    }

    public boolean b() {
        if (this.d == -1) {
            return false;
        }
        fsj fsjVar = this.f26498a;
        if (fsjVar != null && !lsl.c(fsjVar.t(), System.currentTimeMillis())) {
            ReleaseLogUtil.d("R_AchievePopMessageManager", "isShowPopWindow is no sameDay");
            return false;
        }
        AchieveMessage[] achieveMessageArrValues = AchieveMessage.values();
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        for (AchieveMessage achieveMessage : achieveMessageArrValues) {
            if (achieveMessage.getPriorityType() == this.d) {
                String strE = SharedPreferenceManager.e(this.e, String.valueOf(10000), achieveMessage.getSpKey());
                ReleaseLogUtil.d("R_AchievePopMessageManager", "isShowPopWindow spDate:", strE);
                if (TextUtils.isEmpty(strE)) {
                    return true;
                }
                return !String.valueOf(iA).equals(strE);
            }
        }
        ReleaseLogUtil.d("R_AchievePopMessageManager", "isShowPopWindow not match");
        return false;
    }

    enum AchieveMessage {
        CALORIE_ACHIEVE_FOUR(7, "CALORIE_ACHIEVE_FOUR", getContent("ACHIEVE_TYPE_CALORIE", 400), getTitle(R.string.IDS_achicve_move_title, 400)),
        EXERCISE_ACHIEVE_FOUR(6, "EXERCISE_ACHIEVE_FOUR", getContent("ACHIEVE_TYPE_EXERCISE", 400), getTitle(R.string.IDS_achicve_exercise_title, 400)),
        CALORIE_ACHIEVE_THREE(5, "CALORIE_ACHIEVE_THREE", getContent("ACHIEVE_TYPE_CALORIE", 300), getTitle(R.string.IDS_achicve_move_title, 300)),
        EXERCISE_ACHIEVE_THREE(4, "EXERCISE_ACHIEVE_THREE", getContent("ACHIEVE_TYPE_EXERCISE", 300), getTitle(R.string.IDS_achicve_exercise_title, 300)),
        CALORIE_ACHIEVE_TWO(3, "CALORIE_ACHIEVE_TWO", getContent("ACHIEVE_TYPE_CALORIE", 200), getTitle(R.string.IDS_achicve_move_title, 200)),
        EXERCISE_ACHIEVE_TWO(2, "EXERCISE_ACHIEVE_TWO", getContent("ACHIEVE_TYPE_EXERCISE", 200), getTitle(R.string.IDS_achicve_exercise_title, 200)),
        THREE_ACHIEVE(1, "SP_THREE_ACHIEVE", "", qre.f(R.string.IDS_achicve_three_circle));

        private final String mContent;
        private final int mPriorityType;
        private final String mSpKey;
        private final String mTitle;

        AchieveMessage(int i, String str, String str2, String str3) {
            this.mPriorityType = i;
            this.mSpKey = str;
            this.mContent = str2;
            this.mTitle = str3;
        }

        public int getPriorityType() {
            return this.mPriorityType;
        }

        public String getSpKey() {
            return this.mSpKey;
        }

        public String getContent() {
            return this.mContent;
        }

        public String getTitle() {
            return this.mTitle;
        }

        private static String getContent(String str, int i) {
            return qre.a(getRandomContentId(str, i), UnitUtil.e(i, 2, 0));
        }

        private static int getRandomContentId(String str, int i) {
            int iD = qrf.d(2);
            int i2 = 0;
            if ("ACHIEVE_TYPE_CALORIE".equals(str)) {
                RandomAchieveContentCalorie[] randomAchieveContentCalorieArrValues = RandomAchieveContentCalorie.values();
                int length = randomAchieveContentCalorieArrValues.length;
                while (i2 < length) {
                    RandomAchieveContentCalorie randomAchieveContentCalorie = randomAchieveContentCalorieArrValues[i2];
                    if (randomAchieveContentCalorie.mMultiple == i) {
                        return iD == 0 ? randomAchieveContentCalorie.mContentRandomOne : randomAchieveContentCalorie.mContentRandomTwo;
                    }
                    i2++;
                }
                return -1;
            }
            if (!"ACHIEVE_TYPE_EXERCISE".equals(str)) {
                return -1;
            }
            RandomAchieveContentExercise[] randomAchieveContentExerciseArrValues = RandomAchieveContentExercise.values();
            int length2 = randomAchieveContentExerciseArrValues.length;
            while (i2 < length2) {
                RandomAchieveContentExercise randomAchieveContentExercise = randomAchieveContentExerciseArrValues[i2];
                if (randomAchieveContentExercise.mMultiple == i) {
                    return iD == 0 ? randomAchieveContentExercise.mContentRandomOne : randomAchieveContentExercise.mContentRandomTwo;
                }
                i2++;
            }
            return -1;
        }

        private static String getTitle(int i, int i2) {
            return qre.a(i, UnitUtil.e(i2, 2, 0));
        }
    }

    enum RandomAchieveContentCalorie {
        CONTENT_200(200, R.string.IDS_achieve_signal_two_1_cal, R.string.IDS_achieve_signal_two_2_cal),
        CONTENT_300(300, R.string.IDS_achieve_signal_three_1_cal, R.string.IDS_achieve_signal_three_2_cal),
        CONTENT_400(400, R.string.IDS_achieve_signal_four_1_cal, R.string.IDS_achieve_signal_four_2_cal);

        private final int mContentRandomOne;
        private final int mContentRandomTwo;
        private final int mMultiple;

        RandomAchieveContentCalorie(int i, int i2, int i3) {
            this.mMultiple = i;
            this.mContentRandomOne = i2;
            this.mContentRandomTwo = i3;
        }
    }

    enum RandomAchieveContentExercise {
        CONTENT_200(200, R.string.IDS_achieve_signal_two_1_time, R.string.IDS_achieve_signal_two_2_time),
        CONTENT_300(300, R.string.IDS_achieve_signal_three_1_time, R.string.IDS_achieve_signal_three_2_time),
        CONTENT_400(400, R.string.IDS_achieve_signal_four_1_time, R.string.IDS_achieve_signal_four_2_time);

        private final int mContentRandomOne;
        private final int mContentRandomTwo;
        private final int mMultiple;

        RandomAchieveContentExercise(int i, int i2, int i3) {
            this.mMultiple = i;
            this.mContentRandomOne = i2;
            this.mContentRandomTwo = i3;
        }
    }
}
