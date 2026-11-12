package com.huawei.health.dailyactivity.impl;

import android.text.TextUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.health.dailyactivity.impl.ThreeCircleCloudResourceHelper;
import com.huawei.health.healthcloudconfig.helper.BaseCloudResourceHelper;
import com.huawei.health.healthcloudconfig.helper.CheckResourceUpdateCallback;
import com.huawei.health.healthcloudconfig.helper.CloudResourceCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.fcw;
import defpackage.fcz;
import defpackage.fdk;
import defpackage.fdy;
import defpackage.fek;
import defpackage.fel;
import defpackage.qhl;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public class ThreeCircleCloudResourceHelper extends BaseCloudResourceHelper {
    private static final int DEFAULT_UPDATE_INTERVAL = 1;
    private static final String RELEASE_TAG = "R_3CircCloudResHlp";
    private static final String TAG = "ThreeCircleCloudResourceHelper";
    private static final String THREE_CIRCLE_CONFIG_FLAG = "three_circle";
    private static final String THREE_CIRCLE_CONFIG_ID;
    private static final List<String> THREE_CIRCLE_FILE_ID_LIST;
    private static final Map<String, String> THREE_CIRCLE_MATCH_RULES;
    private static final int UNZIP_CODE_FAIL = -1;
    private String mAppRuleFilePath;
    private String mAppStringsFilePath;
    private ThreeCircleStringParser mThreeCircleStringParser;

    static {
        THREE_CIRCLE_CONFIG_ID = CommonUtil.cl() ? "com.huawei.health_threecircle" : "com.huawei.health_ThreeCircle_Android";
        THREE_CIRCLE_FILE_ID_LIST = new ArrayList<String>() { // from class: com.huawei.health.dailyactivity.impl.ThreeCircleCloudResourceHelper.4
            {
                add("rule");
                add("strings");
            }
        };
        THREE_CIRCLE_MATCH_RULES = new LinkedHashMap<String, String>() { // from class: com.huawei.health.dailyactivity.impl.ThreeCircleCloudResourceHelper.3
            {
                put("appVersion", "V100");
            }
        };
    }

    public static ThreeCircleCloudResourceHelper getInstance() {
        return a.d;
    }

    private ThreeCircleCloudResourceHelper() {
        super(THREE_CIRCLE_CONFIG_FLAG, 1);
        this.mAppStringsFilePath = null;
        this.mAppRuleFilePath = null;
    }

    public void checkUpdateForThreeCircle() {
        LogUtil.a(TAG, "begin to checkUpdate for threeCircle");
        super.checkUpdate(THREE_CIRCLE_CONFIG_ID, THREE_CIRCLE_MATCH_RULES, new CheckResourceUpdateCallback() { // from class: com.huawei.health.dailyactivity.impl.ThreeCircleCloudResourceHelper.2
            @Override // com.huawei.health.healthcloudconfig.helper.CheckResourceUpdateCallback
            public void onSuccess(String str, boolean z) {
                LogUtil.a(ThreeCircleCloudResourceHelper.TAG, "check update finished, need update = ", Boolean.valueOf(z));
                if (z) {
                    LogUtil.a(ThreeCircleCloudResourceHelper.TAG, "need update, begin to download");
                    ThreeCircleCloudResourceHelper.this.downloadFilesForThreeCircle();
                }
            }

            @Override // com.huawei.health.healthcloudconfig.helper.CheckResourceUpdateCallback
            public void onFailure(String str, String str2) {
                ThreeCircleCloudResourceHelper.this.onFailureForUpdate(ThreeCircleCloudResourceHelper.TAG, "cannot get file from cloud: " + str2, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadFilesForThreeCircle() {
        LogUtil.a(TAG, "begin to download files");
        super.downloadFiles(THREE_CIRCLE_CONFIG_ID, THREE_CIRCLE_FILE_ID_LIST, THREE_CIRCLE_MATCH_RULES, 1, new CloudResourceCallback() { // from class: com.huawei.health.dailyactivity.impl.ThreeCircleCloudResourceHelper.5
            @Override // com.huawei.health.healthcloudconfig.helper.CloudResourceCallback
            public void onSuccess(String str, List<fel> list) {
                LogUtil.a(ThreeCircleCloudResourceHelper.TAG, "download files success");
                ThreeCircleCloudResourceHelper.this.unzipResourcePkg(list);
            }

            @Override // com.huawei.health.healthcloudconfig.helper.CloudResourceCallback
            public void onFailure(String str, String str2) {
                ReleaseLogUtil.a(ThreeCircleCloudResourceHelper.RELEASE_TAG, "download files failed");
            }
        });
    }

    @Override // com.huawei.health.healthcloudconfig.helper.BaseCloudResourceHelper
    public void handleResponse(fcz fczVar, String str, List<String> list, CloudResourceCallback cloudResourceCallback) {
        List<fcw> listA = fczVar.a();
        LinkedList linkedList = new LinkedList();
        for (fcw fcwVar : listA) {
            for (String str2 : list) {
                if (str2.equals(fcwVar.c())) {
                    String strE = fcwVar.e();
                    String strD = fcwVar.d();
                    String strD2 = fdy.d(str, str2, strD);
                    if (TextUtils.isEmpty(strE) || TextUtils.isEmpty(strD) || TextUtils.isEmpty(strD2)) {
                        onFailureForDownload(RELEASE_TAG, "version or downloadUrl or filePath is empty", cloudResourceCallback);
                    } else {
                        File file = new File(strD2);
                        String[] strArrSplit = strD2.split("\\.");
                        String str3 = file.getParent() + File.separator + str2 + "." + strE + "." + strArrSplit[strArrSplit.length - 1];
                        File file2 = new File(str3);
                        LogUtil.a(TAG, "defaultFilePath = ", strD2, ", newFileName = ", str3);
                        boolean zRenameTo = file.renameTo(file2);
                        String path = file.getPath();
                        if (!zRenameTo) {
                            ReleaseLogUtil.d(RELEASE_TAG, "renameFile failed: maybe file exists");
                        } else {
                            path = file2.getPath();
                        }
                        fel felVar = new fel();
                        felVar.a(str2);
                        felVar.e(CommonUtils.j(strE));
                        felVar.c(path);
                        linkedList.add(felVar);
                    }
                }
                if (cloudResourceCallback != null) {
                    cloudResourceCallback.onSuccess(TAG, linkedList);
                }
            }
        }
    }

    @Override // com.huawei.health.healthcloudconfig.helper.BaseCloudResourceHelper
    public List<fdk> getLocalFileData(File[] fileArr) {
        LinkedList linkedList = new LinkedList();
        for (File file : fileArr) {
            String name = file.getName();
            LogUtil.a(TAG, "get fileName = ", name);
            String[] strArrSplit = name.split("\\.");
            if (strArrSplit.length != 3) {
                ReleaseLogUtil.e(RELEASE_TAG, "fileName is invalid");
            } else {
                fdk fdkVar = new fdk();
                fdkVar.e(strArrSplit[0]);
                fdkVar.a(CommonUtils.j(strArrSplit[1]));
                linkedList.add(fdkVar);
            }
        }
        return linkedList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unzipResourcePkg(List<fel> list) {
        LogUtil.a(TAG, "begin to unzip resource package");
        Iterator<fel> it = list.iterator();
        while (it.hasNext()) {
            String strD = it.next().d();
            if (strD.endsWith(".zip")) {
                int iA = fek.a(strD, strD.split(".zip")[0]);
                LogUtil.a(TAG, "resultCode = ", Integer.valueOf(iA));
                if (iA == -1) {
                    ReleaseLogUtil.d(RELEASE_TAG, "unzip failed");
                }
            }
        }
        deleteOldFiles();
    }

    private void deleteOldFiles() {
        LogUtil.a(TAG, "begin to delete old files");
        File[] fileArrListFiles = new File(fdy.d(THREE_CIRCLE_CONFIG_ID, (String) null, (String) null)).listFiles();
        if (fileArrListFiles == null) {
            ReleaseLogUtil.e(RELEASE_TAG, "fileList is empty");
            return;
        }
        Arrays.sort(fileArrListFiles, new Comparator() { // from class: dma
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ThreeCircleCloudResourceHelper.lambda$deleteOldFiles$0((File) obj, (File) obj2);
            }
        });
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        for (File file : fileArrListFiles) {
            String name = file.getName();
            if (file.isDirectory()) {
                linkedList3.add(name);
            } else if (name.endsWith("json")) {
                linkedList.add(name);
            } else if (name.endsWith(".zip")) {
                linkedList2.add(name);
            }
        }
        LogUtil.a(TAG, "jsonFile = ", linkedList, ", zipFile = ", linkedList2, ", unzipFile = ", linkedList3);
        for (File file2 : fileArrListFiles) {
            String name2 = file2.getName();
            boolean z = !linkedList.isEmpty() && name2.equals(linkedList.get(0));
            boolean z2 = !linkedList2.isEmpty() && name2.equals(linkedList2.get(0));
            if ((!linkedList3.isEmpty() && name2.equals(linkedList3.get(0))) || z || z2) {
                ReleaseLogUtil.d(RELEASE_TAG, name2, " is latest, keep it");
            } else if (!file2.isDirectory()) {
                ReleaseLogUtil.d(RELEASE_TAG, "deleteSourceFile sourceFile = ", name2, ", isDeleted = ", Boolean.valueOf(FileUtils.b(file2)));
            } else {
                FileUtils.e(file2);
                ReleaseLogUtil.d(RELEASE_TAG, "deleteSourceFile sourceFile = ", name2);
            }
        }
    }

    public static /* synthetic */ int lambda$deleteOldFiles$0(File file, File file2) {
        return (int) (file2.lastModified() - file.lastModified());
    }

    private void initThreeCircleParser() {
        String strD = fdy.d(THREE_CIRCLE_CONFIG_ID, (String) null, (String) null);
        if (TextUtils.isEmpty(strD)) {
            ReleaseLogUtil.a(RELEASE_TAG, "rootFilePath is empty");
            this.mThreeCircleStringParser = new ThreeCircleStringParser("", "");
            return;
        }
        File[] fileArrListFiles = new File(strD).listFiles();
        if (fileArrListFiles == null) {
            ReleaseLogUtil.e(RELEASE_TAG, "fileList is empty");
            this.mThreeCircleStringParser = new ThreeCircleStringParser("", "");
            return;
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            if (file.isDirectory()) {
                this.mAppStringsFilePath = fdy.d(THREE_CIRCLE_CONFIG_ID, name, (String) null);
            }
            if (name.endsWith("json")) {
                this.mAppRuleFilePath = fdy.d(THREE_CIRCLE_CONFIG_ID, name, (String) null);
            }
        }
        LogUtil.a(TAG, "mAppStringsFilePath = ", this.mAppStringsFilePath, ", mAppRuleFilePath = ", this.mAppRuleFilePath);
        this.mThreeCircleStringParser = new ThreeCircleStringParser(this.mAppRuleFilePath, this.mAppStringsFilePath);
    }

    private ThreeCircleStringParser getThreeCircleParser() {
        if (isNeedParserInit()) {
            initThreeCircleParser();
        }
        return this.mThreeCircleStringParser;
    }

    private boolean isNeedParserInit() {
        if (this.mThreeCircleStringParser == null) {
            ReleaseLogUtil.e(RELEASE_TAG, "mThreeCircleParseApi is null, begin to init mThreeCircleParseApi");
            return true;
        }
        if (TextUtils.isEmpty(this.mAppRuleFilePath)) {
            ReleaseLogUtil.e(RELEASE_TAG, "mAppRuleFilePath is null, begin to init mThreeCircleParseApi");
            return true;
        }
        if (!TextUtils.isEmpty(this.mAppStringsFilePath)) {
            return false;
        }
        ReleaseLogUtil.e(RELEASE_TAG, "mAppStringsFilePath is null, begin to init mThreeCircleParseApi");
        return true;
    }

    public qhl queryRules(String str, String str2) {
        ReleaseLogUtil.d(TAG, "queryRules called");
        ThreeCircleStringParser threeCircleParser = getThreeCircleParser();
        this.mThreeCircleStringParser = threeCircleParser;
        if (threeCircleParser == null) {
            ReleaseLogUtil.e(TAG, "mThreeCircleParseApi is null");
            return null;
        }
        return threeCircleParser.queryRules(str, str2);
    }

    public String getPromptMessage(qhl qhlVar, Map<String, String> map) {
        ReleaseLogUtil.d(TAG, "getPromptMessage called");
        ThreeCircleStringParser threeCircleParser = getThreeCircleParser();
        this.mThreeCircleStringParser = threeCircleParser;
        if (threeCircleParser == null) {
            ReleaseLogUtil.e(TAG, "mThreeCircleParseApi is null");
            return null;
        }
        return threeCircleParser.getPromptMessage(qhlVar, map);
    }

    static class a {
        private static final ThreeCircleCloudResourceHelper d = new ThreeCircleCloudResourceHelper();
    }
}
