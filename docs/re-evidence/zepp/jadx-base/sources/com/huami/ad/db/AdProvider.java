package com.huami.ad.db;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.ad.AdModule;
import com.huami.ad.entity.AdCardEntity;
import com.huami.ad.entity.TextImageEntity;
import com.huami.ad.entity.TextLinkEntity;
import com.huami.ad.utils.AdHelper;
import com.huami.ad.web.AdAPI;
import com.huami.tools.log.HMLog;
import com.huami.utils.persistence.kvkit.KvKit;
import com.huami.utils.persistence.kvkit.KvPersistence;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.AdEntity;
import com.xiaomi.hm.health.databases.model.AdEntityDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.query.WhereCondition;

/* JADX INFO: loaded from: classes4.dex */
public class AdProvider {
    public static final String BADGE_MESSAGE = "message";
    public static final String CATEGORY_DETAIL_PAGE_AD = "step_detail_ad";
    public static final String CATEGORY_HOMEPAGE_AD = "homepage_ad";
    public static final String CATEGORY_HOMEPAGE_POP = "homepage_pop";
    public static final String CATEGORY_SPORT_AD = "sport_ad";
    public static final String CATEGORY_SPORT_SUMMARY_AD = "sport_summary_ad";
    public static final String CATEGORY_SPORT_TRAINING = "sport_training_ad";
    public static final String CATEGORY_TRAINING_VIDEO_AD = "training_video_ad";
    public static final int STATUS_CLOSE = -1;
    public static final int STATUS_NEW = 1;
    private static final String f = "AdProvider";
    private static final String g = "last_show_sport_img_ad_key";
    private static final String h = "last_show_sport_summary_key";
    private static final String i = "last_show_pause_training_video_message_key";
    private static final String j = "last_show_rest_training_video_message_key";
    private static final String k = "last_show_pause_training_video_ad_key";
    private static final String l = "last_show_rest_training_video_ad_key";
    private static final String m = "last_show_status_card_key";
    private static final String n = "last_show_status_message_card_key";
    private static final String o = "KEY_LAST_SHOW_SPORT_TRAINING_CARD_AD";
    private static final String p = "KEY_LAST_SHOW_HOME_PAGE_NOTIFY_AD";
    private static AdProvider q;
    private final Object b = new Object();
    private List<String> c = new ArrayList();
    private final String e = "MMKV_ADPROVIDER_FILENAME";
    private SharedPreferences a = AdModule.appContext.getSharedPreferences(f, 0);
    private KvPersistence d = KvKit.getKvPersistence("MMKV_ADPROVIDER_FILENAME", false);

    public class a extends TypeToken<List<String>> {
        public a() {
        }
    }

    private AdProvider() {
    }

    private List<TextLinkEntity> a() {
        List<AdEntity> list = HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Category.eq(CATEGORY_TRAINING_VIDEO_AD), AdEntityDao.Properties.EndTime.gt(Long.valueOf(System.currentTimeMillis())), AdEntityDao.Properties.IsValidity.eq(Boolean.TRUE), AdEntityDao.Properties.Badge.eq(TextLinkEntity.BADGE_AD)).list();
        ArrayList arrayList = new ArrayList();
        Iterator<AdEntity> it2 = list.iterator();
        while (it2.hasNext()) {
            TextLinkEntity trainingTextLinkEntity = AdHelper.toTrainingTextLinkEntity(it2.next());
            if (trainingTextLinkEntity != null) {
                arrayList.add(trainingTextLinkEntity);
            }
        }
        return arrayList;
    }

    private List<TextLinkEntity> b() {
        List<AdEntity> list = HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Category.eq(CATEGORY_TRAINING_VIDEO_AD), AdEntityDao.Properties.EndTime.gt(Long.valueOf(System.currentTimeMillis())), AdEntityDao.Properties.IsValidity.eq(Boolean.TRUE), AdEntityDao.Properties.Badge.eq("")).list();
        ArrayList arrayList = new ArrayList();
        Iterator<AdEntity> it2 = list.iterator();
        while (it2.hasNext()) {
            TextLinkEntity trainingTextLinkEntity = AdHelper.toTrainingTextLinkEntity(it2.next());
            if (trainingTextLinkEntity != null) {
                arrayList.add(trainingTextLinkEntity);
            }
        }
        return arrayList;
    }

    private void c(String str, String str2) {
        synchronized (this.b) {
            SharedPreferences.Editor editorEdit = this.a.edit();
            editorEdit.putString(str, str2);
            editorEdit.apply();
        }
    }

    public static List<AdEntity> getHomePagesAd() {
        return HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Category.in(AdAPI.HOME_PAGE_ADS_ARRAY), new WhereCondition[0]).list();
    }

    public static List<AdEntity> getHomePagesAdByType(String str) {
        return HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Category.eq(str), AdEntityDao.Properties.EndTime.gt(Long.valueOf(System.currentTimeMillis())), AdEntityDao.Properties.Status.notEq(-1), AdEntityDao.Properties.IsValidity.eq(Boolean.TRUE)).list();
    }

    public static AdProvider getInstance() {
        if (q == null) {
            synchronized (AdProvider.class) {
                q = new AdProvider();
            }
        }
        return q;
    }

    public static List<AdEntity> getInvalidSportImgAd() {
        return HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Category.eq(CATEGORY_SPORT_AD), new WhereCondition[0]).whereOr(AdEntityDao.Properties.EndTime.le(Long.valueOf(System.currentTimeMillis())), AdEntityDao.Properties.IsValidity.eq(Boolean.FALSE), new WhereCondition[0]).list();
    }

    public static List<AdEntity> getInvalidStatusAdPop() {
        return HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Category.eq(CATEGORY_HOMEPAGE_POP), new WhereCondition[0]).whereOr(AdEntityDao.Properties.EndTime.le(Long.valueOf(System.currentTimeMillis())), AdEntityDao.Properties.IsValidity.eq(Boolean.FALSE), AdEntityDao.Properties.DisplayCount.ge(1)).list();
    }

    public static List<AdEntity> getSportAd() {
        return HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Category.eq(CATEGORY_SPORT_AD), AdEntityDao.Properties.EndTime.gt(Long.valueOf(System.currentTimeMillis())), AdEntityDao.Properties.IsValidity.eq(Boolean.TRUE)).list();
    }

    public static List<TextImageEntity> getValidStatusAdPop() {
        List<AdEntity> list = HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Category.eq(CATEGORY_HOMEPAGE_POP), AdEntityDao.Properties.EndTime.gt(Long.valueOf(System.currentTimeMillis())), AdEntityDao.Properties.DisplayCount.lt(1), AdEntityDao.Properties.IsValidity.eq(Boolean.TRUE)).list();
        ArrayList arrayList = new ArrayList();
        Iterator<AdEntity> it2 = list.iterator();
        while (it2.hasNext()) {
            TextImageEntity textImageAd = AdHelper.toTextImageAd(it2.next());
            if (textImageAd != null) {
                arrayList.add(textImageAd);
            }
        }
        return arrayList;
    }

    public synchronized void deleteAllAdEntity(String str) {
        HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Category.eq(str), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
    }

    public List<AdCardEntity> getAdCardEntity(boolean z) {
        HMLog.i(f, "getAdCardEntity isMessage :" + z, new Object[0]);
        List<AdEntity> list = z ? HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Category.eq("homepage_ad"), AdEntityDao.Properties.IsValidity.eq(Boolean.TRUE), AdEntityDao.Properties.Badge.eq("message"), AdEntityDao.Properties.Status.notEq(-1)).list() : HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Category.eq("homepage_ad"), AdEntityDao.Properties.IsValidity.eq(Boolean.TRUE), AdEntityDao.Properties.Badge.notEq("message"), AdEntityDao.Properties.Status.notEq(-1)).list();
        ArrayList arrayList = new ArrayList();
        for (AdEntity adEntity : list) {
            HMLog.i(f, "getAdCardEntity:" + adEntity, new Object[0]);
            AdCardEntity statusCardAd = AdHelper.toStatusCardAd(adEntity);
            if (statusCardAd != null) {
                arrayList.add(statusCardAd);
            }
        }
        return arrayList;
    }

    public String getLastShowPauseTrainingVideoAdKey() {
        return this.a.getString(k, "");
    }

    public String getLastShowPauseTrainingVideoMessageKey() {
        return this.a.getString(i, "");
    }

    public String getLastShowRestTrainingVideoAdKey() {
        return this.a.getString(l, "");
    }

    public String getLastShowRestTrainingVideoMessageKey() {
        return this.a.getString(j, "");
    }

    public String getLastShowSportImgAdKey() {
        return this.a.getString(g, "");
    }

    public String getLastShowSportSummaryKey() {
        return this.a.getString(h, "");
    }

    public String getLastShowSportTrainingAdCardKey() {
        return this.a.getString(o, "");
    }

    public String getLastShowStatusAdCardKey() {
        return this.a.getString(m, "");
    }

    public String getLastShowStatusMessageCardKey() {
        return this.a.getString(n, "");
    }

    public AdEntity getLoadedAdEntity(String str) {
        return HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Id.eq(str), new WhereCondition[0]).unique();
    }

    public AdEntity getLocalDetailPageAd(int i2) {
        List<AdEntity> list = HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Category.eq(CATEGORY_DETAIL_PAGE_AD), AdEntityDao.Properties.EndTime.gt(Long.valueOf(System.currentTimeMillis())), AdEntityDao.Properties.Status.notEq(-1), AdEntityDao.Properties.IsValidity.eq(Boolean.TRUE), AdEntityDao.Properties.SupportType.eq(Integer.valueOf(i2))).orderDesc(AdEntityDao.Properties.CreateTime).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<TextLinkEntity> getLocalPauseTrainingVideoAd() {
        List<TextLinkEntity> listA = a();
        ArrayList arrayList = new ArrayList();
        for (TextLinkEntity textLinkEntity : listA) {
            if (textLinkEntity.supportType.contains("2") || textLinkEntity.supportType.contains("3")) {
                arrayList.add(textLinkEntity);
            }
        }
        return arrayList;
    }

    public List<TextLinkEntity> getLocalPauseTrainingVideoMessage() {
        List<TextLinkEntity> listB = b();
        ArrayList arrayList = new ArrayList();
        for (TextLinkEntity textLinkEntity : listB) {
            if (textLinkEntity.supportType.contains("2") || textLinkEntity.supportType.contains("3")) {
                arrayList.add(textLinkEntity);
            }
        }
        return arrayList;
    }

    public List<TextLinkEntity> getLocalRestTrainingVideoAd() {
        List<TextLinkEntity> listA = a();
        ArrayList arrayList = new ArrayList();
        for (TextLinkEntity textLinkEntity : listA) {
            if (textLinkEntity.supportType.contains("1") || textLinkEntity.supportType.contains("3")) {
                arrayList.add(textLinkEntity);
            }
        }
        return arrayList;
    }

    public List<TextLinkEntity> getLocalRestTrainingVideoMessage() {
        List<TextLinkEntity> listB = b();
        ArrayList arrayList = new ArrayList();
        for (TextLinkEntity textLinkEntity : listB) {
            if (textLinkEntity.supportType.contains("1") || textLinkEntity.supportType.contains("3")) {
                arrayList.add(textLinkEntity);
            }
        }
        return arrayList;
    }

    public List<TextImageEntity> getLocalSportImgAd() {
        List<AdEntity> sportAd = getSportAd();
        ArrayList arrayList = new ArrayList();
        Iterator<AdEntity> it2 = sportAd.iterator();
        while (it2.hasNext()) {
            TextImageEntity textImageAd = AdHelper.toTextImageAd(it2.next());
            if (textImageAd != null) {
                arrayList.add(textImageAd);
            }
        }
        return arrayList;
    }

    public List<TextImageEntity> getLocalSportImgAdByType(int i2) {
        List<TextImageEntity> localSportImgAd = getInstance().getLocalSportImgAd();
        ArrayList arrayList = new ArrayList();
        for (TextImageEntity textImageEntity : localSportImgAd) {
            if (textImageEntity.sportTypes.contains(i2 + "")) {
                arrayList.add(textImageEntity);
            }
        }
        return arrayList;
    }

    public List<TextLinkEntity> getLocalSportSummary() {
        List<AdEntity> list = HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Category.eq(CATEGORY_SPORT_SUMMARY_AD), AdEntityDao.Properties.EndTime.gt(Long.valueOf(System.currentTimeMillis())), AdEntityDao.Properties.IsValidity.eq(Boolean.TRUE)).list();
        ArrayList arrayList = new ArrayList();
        Iterator<AdEntity> it2 = list.iterator();
        while (it2.hasNext()) {
            TextLinkEntity textLinkEntity = AdHelper.toTextLinkEntity(it2.next());
            if (textLinkEntity != null) {
                arrayList.add(textLinkEntity);
            }
        }
        return arrayList;
    }

    public List<TextLinkEntity> getLocalSportSummaryByType(int i2) {
        List<TextLinkEntity> localSportSummary = getInstance().getLocalSportSummary();
        ArrayList arrayList = new ArrayList();
        for (TextLinkEntity textLinkEntity : localSportSummary) {
            if (textLinkEntity.supportType.contains(i2 + "")) {
                arrayList.add(textLinkEntity);
            }
        }
        return arrayList;
    }

    public List<String> getReadHomePageNotifies() {
        List list;
        KvPersistence kvPersistence = this.d;
        if (kvPersistence == null) {
            return this.c;
        }
        String str = (String) kvPersistence.getValue(p, "");
        if (str != null && !TextUtils.isEmpty(str) && (list = (List) new Gson().fromJson(str, new a().getType())) != null && list.size() > 0) {
            this.c.clear();
            this.c.addAll(list);
        }
        return this.c;
    }

    public List<TextImageEntity> getSportTrainingAdCardEntity() {
        List<AdEntity> list = HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Category.eq("sport_training_ad"), AdEntityDao.Properties.IsValidity.eq(Boolean.TRUE), AdEntityDao.Properties.Badge.notEq("message"), AdEntityDao.Properties.Status.notEq(-1)).list();
        ArrayList arrayList = new ArrayList();
        for (AdEntity adEntity : list) {
            HMLog.i(f, "getSportTrainingAdCardEntity:" + adEntity, new Object[0]);
            TextImageEntity textImageAd = AdHelper.toTextImageAd(adEntity);
            if (textImageAd != null) {
                arrayList.add(textImageAd);
            }
        }
        return arrayList;
    }

    public String getStringMMKV(String str, String str2) {
        if (str != null) {
            return (String) this.d.getValue(str, str2);
        }
        return null;
    }

    public List<AdEntity> getValidityAdEntity(String str) {
        return HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Category.eq(str), AdEntityDao.Properties.EndTime.gt(Long.valueOf(System.currentTimeMillis())), AdEntityDao.Properties.IsValidity.eq(Boolean.TRUE)).list();
    }

    public synchronized void insertAllAdEntity(List<AdEntity> list) {
        HMDaoManager.getInstance().getAdEntityDao().insertInTx(list);
    }

    public void insertOrReplaceAdEntity(List<AdEntity> list, String str) {
        List<AdEntity> list2 = TextUtils.equals(str, "homepage_ad") ? HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Category.eq(str), new WhereCondition[0]).list() : HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Category.eq(str), AdEntityDao.Properties.IsValidity.eq(Boolean.TRUE)).list();
        ArrayList arrayList = new ArrayList();
        for (AdEntity adEntity : list2) {
            adEntity.isValidity = Boolean.FALSE;
            arrayList.add(adEntity.getId());
        }
        HMDaoManager.getInstance().getAdEntityDao().updateInTx(list2);
        List<AdEntity> list3 = HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Id.in(arrayList), new WhereCondition[0]).list();
        for (AdEntity adEntity2 : list) {
            adEntity2.isValidity = Boolean.TRUE;
            for (AdEntity adEntity3 : list3) {
                if (adEntity2.getId().equals(adEntity3.getId())) {
                    adEntity2.displayCount = adEntity3.displayCount;
                    adEntity2.setCloseTime(adEntity3.getCloseTime());
                    adEntity2.setStatus(adEntity3.getStatus());
                    break;
                }
            }
        }
        HMDaoManager.getInstance().getAdEntityDao().insertOrReplaceInTx(list);
    }

    public void insertOrReplaceHomepageAd(List<AdEntity> list) {
        insertOrReplaceAdEntity(list, "homepage_ad");
    }

    public void insertOrReplaceHomepageAdsByTypes(List<AdEntity> list, String str) {
        insertOrReplaceAdEntity(list, str);
    }

    public void insertOrReplaceHomepagePop(List<AdEntity> list) {
        insertOrReplaceAdEntity(list, CATEGORY_HOMEPAGE_POP);
    }

    public void insertOrReplaceSportImgAd(List<AdEntity> list) {
        insertOrReplaceAdEntity(list, CATEGORY_SPORT_AD);
        AdHelper.deleteInvalidSportImgAd();
        AdHelper.preloadValidSportImgAd();
    }

    public void insertOrReplaceSportSummary(List<AdEntity> list) {
        insertOrReplaceAdEntity(list, CATEGORY_SPORT_SUMMARY_AD);
    }

    public void insertOrReplaceSportTrainingAd(List<AdEntity> list) {
        insertOrReplaceAdEntity(list, "sport_training_ad");
    }

    public void insertOrReplaceTrainingVideoAd(List<AdEntity> list) {
        insertOrReplaceAdEntity(list, CATEGORY_TRAINING_VIDEO_AD);
    }

    public void replaceStatusCardClosedStatus(String str) {
        AdEntity adEntityUnique = HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Id.eq(str), new WhereCondition[0]).unique();
        adEntityUnique.setStatus(-1);
        HMDaoManager.getInstance().getAdEntityDao().insertOrReplace(adEntityUnique);
    }

    public void saveLastHomePageNotify(String str) {
        KvPersistence kvPersistence;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!this.c.contains(str)) {
            this.c.add(str);
        }
        String json = new Gson().toJson(this.c);
        if (TextUtils.isEmpty(json) || (kvPersistence = this.d) == null) {
            return;
        }
        kvPersistence.setValue(p, json);
    }

    public void saveLastShowPauseTrainingVideoAdKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(k, str);
    }

    public void saveLastShowPauseTrainingVideoMessageKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(i, str);
    }

    public void saveLastShowRestTrainingVideoAdKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(l, str);
    }

    public void saveLastShowRestTrainingVideoMessageKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(j, str);
    }

    public void saveLastShowSportImgAdKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(g, str);
    }

    public void saveLastShowSportSummaryKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(h, str);
    }

    public void saveLastShowSportTrainingAdCardKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(o, str);
    }

    public void saveLastShowStatusAdCardKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(m, str);
    }

    public void saveLastShowStatusMessageCardKey(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(n, str);
    }

    public void saveStringMMKV(String str, String str2) {
        if (str != null) {
            this.d.setValue(str, str2);
        }
    }

    public void updateDisplayCount(String str) {
        AdEntity adEntityUnique = HMDaoManager.getInstance().getAdEntityDao().queryBuilder().where(AdEntityDao.Properties.Id.eq(str), new WhereCondition[0]).unique();
        adEntityUnique.displayCount = Integer.valueOf(adEntityUnique.displayCount.intValue() + 1);
        HMDaoManager.getInstance().getAdEntityDao().insertOrReplace(adEntityUnique);
    }

    public synchronized void updateLoadedAdEntity(AdEntity adEntity) {
        HMDaoManager.getInstance().getAdEntityDao().update(adEntity);
    }
}
