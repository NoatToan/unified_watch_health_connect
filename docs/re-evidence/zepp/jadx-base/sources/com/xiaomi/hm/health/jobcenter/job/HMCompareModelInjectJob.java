package com.xiaomi.hm.health.jobcenter.job;

import android.text.TextUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.CompareModel;
import com.xiaomi.hm.health.databases.model.CompareModelDao;
import com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.ui.information.DetailInfoCompareHelper;
import com.xiaomi.hm.health.ui.smartplay.appnotify.CharacterParser;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import org.greenrobot.greendao.query.WhereCondition;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class HMCompareModelInjectJob extends ThreadJobObject {
    private static final String c = "HMCompareModelInjectJob";
    private static final String d = "offline_model.json.zip";

    public HMCompareModelInjectJob() {
        super(4);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0093 A[Catch: IOException -> 0x008f, TRY_LEAVE, TryCatch #5 {IOException -> 0x008f, blocks: (B:28:0x008b, B:32:0x0093), top: B:53:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7 A[Catch: IOException -> 0x00a3, TRY_LEAVE, TryCatch #2 {IOException -> 0x00a3, blocks: (B:39:0x009f, B:43:0x00a7), top: B:47:0x009f }] */
    private String c() throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStreamOpen;
        File file = new File(BraceletApp.getContext().getFilesDir().getAbsolutePath() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + d);
        StringBuilder sb = new StringBuilder();
        sb.append("path = ");
        sb.append(file.getPath());
        HMLog.d(c, sb.toString(), new Object[0]);
        InputStream inputStream = null;
        try {
            inputStreamOpen = BraceletApp.getContext().getAssets().open(d);
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = inputStreamOpen.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i);
                            th = th;
                            inputStream = inputStreamOpen;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            } else if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                        fileOutputStream.flush();
                        String path = file.getPath();
                        try {
                            inputStreamOpen.close();
                            fileOutputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        return path;
                    } catch (Exception e3) {
                        e = e3;
                        e.printStackTrace();
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } catch (IOException e4) {
                                e4.printStackTrace();
                                return null;
                            }
                        } else if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e5) {
                e = e5;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Exception e6) {
            e = e6;
            inputStreamOpen = null;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    private void d(String file, String province) throws Exception {
        ZipFile zipFile = new ZipFile(file);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                ZipInputStream zipInputStream = new ZipInputStream(bufferedInputStream);
                StringBuilder sb = null;
                while (true) {
                    try {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry == null) {
                            break;
                        }
                        if (nextEntry.isDirectory()) {
                            HMLog.d(c, "directory", new Object[0]);
                        } else {
                            if (nextEntry.getName().contains("" + province)) {
                                HMLog.i(c, "file - " + nextEntry.getName() + " : " + nextEntry.getSize() + " bytes", new Object[0]);
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(zipFile.getInputStream(nextEntry)));
                                try {
                                    StringBuilder sb2 = new StringBuilder();
                                    while (true) {
                                        String line = bufferedReader.readLine();
                                        if (line == null) {
                                            break;
                                        } else {
                                            sb2.append(line);
                                        }
                                        try {
                                            zipInputStream.close();
                                        } catch (Throwable th) {
                                            th.addSuppressed(th);
                                        }
                                        throw th;
                                    }
                                    bufferedReader.close();
                                    sb = sb2;
                                } catch (Throwable th2) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            } else {
                                continue;
                            }
                        }
                    } catch (Throwable th4) {
                        zipInputStream.close();
                        throw th4;
                    }
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th5) {
                        th.addSuppressed(th5);
                    }
                    throw th;
                }
                zipInputStream.closeEntry();
                zipInputStream.close();
                bufferedInputStream.close();
                zipFile.close();
                if (sb == null) {
                    HMLog.i(c, "empty builder ********", new Object[0]);
                    return;
                }
                JSONArray jSONArrayOptJSONArray = new JSONObject(sb.toString()).optJSONArray("data");
                HMLog.i(c, "injectOfflineModelToDb  array size == " + jSONArrayOptJSONArray.length(), new Object[0]);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("item_values");
                    if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                            CompareModel compareModel = new CompareModel();
                            compareModel.setAgeGroup(Integer.valueOf(jSONObject.optInt("age_group")));
                            compareModel.setTimeValue(jSONObject.optString("time_value"));
                            compareModel.setItemType(jSONObject.optString("item_type"));
                            compareModel.setGender(Integer.valueOf(jSONObject.optInt("gender")));
                            compareModel.setCategoryCount(Integer.valueOf(jSONObject.optInt("category_count")));
                            compareModel.setLocation(province);
                            compareModel.setTimeUnit(Integer.valueOf(jSONObject.optInt("time_unit")));
                            compareModel.setAggregationLevel(jSONObject.optString("aggregation_level"));
                            JSONObject jSONObject2 = (JSONObject) jSONArrayOptJSONArray2.get(i2);
                            compareModel.setCategory(Integer.valueOf(jSONObject2.optInt("category")));
                            compareModel.setCount(Integer.valueOf(jSONObject2.optInt("count")));
                            arrayList.add(compareModel);
                        }
                    }
                }
                HMLog.i(c, "injectOfflineModelToDb  list size == " + arrayList.size(), new Object[0]);
                if (!arrayList.isEmpty()) {
                    HMDaoManager.getInstance().getCompareModelDao().insertInTx(arrayList);
                    if (!province.equals("zhongguo")) {
                        HMKeeper.saveOfflineModelInjectResult(province);
                    }
                }
                HMLog.i(c, "injectOfflineModelToDb  db size  == " + HMDaoManager.getInstance().getCompareModelDao().count(), new Object[0]);
                HMLog.i(c, "file delete result == " + new File(file).delete(), new Object[0]);
                arrayList.clear();
            } catch (Throwable th6) {
                bufferedInputStream.close();
                throw th6;
            }
        } catch (Throwable th7) {
            try {
                zipFile.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    @Override // com.xiaomi.hm.health.jobcenter.manager.ThreadJobObject, java.lang.Runnable
    public void run() {
        super.run();
        try {
            if (HMDaoManager.getInstance().getCompareModelDao().queryBuilder().where(CompareModelDao.Properties.Location.eq("zhongguo"), new WhereCondition[0]).count() == 0) {
                d(c(), "zhongguo");
            }
            String sellingIgnoreCaseLow = CharacterParser.getInstance().getSellingIgnoreCaseLow(DetailInfoCompareHelper.getLocationProvinceForCompareModel());
            HMLog.i(c, "HMKeeper.getOfflineModelInjectResult() == " + HMKeeper.getOfflineModelInjectResult() + " , " + sellingIgnoreCaseLow, new Object[0]);
            if (TextUtils.isEmpty(HMKeeper.getOfflineModelInjectResult()) || !HMKeeper.getOfflineModelInjectResult().equals(sellingIgnoreCaseLow)) {
                HMDaoManager.getInstance().getCompareModelDao().deleteAll();
                if ("zhongguo".equals(sellingIgnoreCaseLow)) {
                    d(c(), sellingIgnoreCaseLow);
                } else {
                    d(c(), "zhongguo");
                    d(c(), sellingIgnoreCaseLow);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            HMLog.i(c, "error " + e.getMessage(), new Object[0]);
        }
    }
}
