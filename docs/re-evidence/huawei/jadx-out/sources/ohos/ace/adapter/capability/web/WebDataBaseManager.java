package ohos.ace.adapter.capability.web;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class WebDataBaseManager {
    static final String LOG_TAG = "WebDataBaseManager";
    private static WebDataBaseManager instance;
    private WebDataBaseCredentialDao credentialDao;
    private WebDataBaseHelper db;
    private WebDataBaseGeolocationPermissionsDao geolocationPermissionsDao;
    private WebDataBaseHttpAuthDao httpAuthDao;

    private WebDataBaseManager() {
    }

    private WebDataBaseManager(WebDataBaseHelper webDataBaseHelper, WebDataBaseHttpAuthDao webDataBaseHttpAuthDao, WebDataBaseCredentialDao webDataBaseCredentialDao, WebDataBaseGeolocationPermissionsDao webDataBaseGeolocationPermissionsDao) {
        this.db = webDataBaseHelper;
        this.httpAuthDao = webDataBaseHttpAuthDao;
        this.credentialDao = webDataBaseCredentialDao;
        this.geolocationPermissionsDao = webDataBaseGeolocationPermissionsDao;
    }

    public static WebDataBaseManager getInstance(Context context) {
        WebDataBaseManager webDataBaseManager = instance;
        if (webDataBaseManager != null) {
            return webDataBaseManager;
        }
        WebDataBaseHelper webDataBaseHelper = new WebDataBaseHelper(context.getApplicationContext());
        WebDataBaseManager webDataBaseManager2 = new WebDataBaseManager(webDataBaseHelper, new WebDataBaseHttpAuthDao(webDataBaseHelper), new WebDataBaseCredentialDao(webDataBaseHelper), new WebDataBaseGeolocationPermissionsDao(webDataBaseHelper));
        instance = webDataBaseManager2;
        return webDataBaseManager2;
    }

    public List<WebDataBaseCredential> getHttpAuthCredentials(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        WebDataBaseHttpAuth webDataBaseHttpAuthFind = this.httpAuthDao.find(str, str2);
        return webDataBaseHttpAuthFind != null ? this.credentialDao.getAllByHttpAuthId(webDataBaseHttpAuthFind.getId()) : arrayList;
    }

    public WebDataBaseCredential getHttpAuthCredential(String str, String str2) {
        List<WebDataBaseCredential> httpAuthCredentials = getHttpAuthCredentials(str, str2);
        return !httpAuthCredentials.isEmpty() ? httpAuthCredentials.get(httpAuthCredentials.size() - 1) : new WebDataBaseCredential("", "");
    }

    public void deleteAllAuthCredentials() {
        WebDataBaseHelper webDataBaseHelper = this.db;
        webDataBaseHelper.clearAllTables(webDataBaseHelper.getWritableDatabase());
    }

    public void saveHttpAuthCredential(String str, String str2, String str3, String str4) {
        Long id;
        boolean z;
        WebDataBaseHttpAuth webDataBaseHttpAuthFind = this.httpAuthDao.find(str, str2);
        if (webDataBaseHttpAuthFind == null) {
            id = Long.valueOf(this.httpAuthDao.insert(new WebDataBaseHttpAuth(null, str, str2)));
        } else {
            id = webDataBaseHttpAuthFind.getId();
        }
        WebDataBaseCredential webDataBaseCredentialFind = this.credentialDao.find(str3, str4, id);
        if (webDataBaseCredentialFind != null) {
            if (webDataBaseCredentialFind.getUsername().equals(str3)) {
                z = false;
            } else {
                webDataBaseCredentialFind.setUsername(str3);
                z = true;
            }
            if (!webDataBaseCredentialFind.getPassword().equals(str4)) {
                webDataBaseCredentialFind.setPassword(str4);
            } else if (!z) {
                return;
            }
            this.credentialDao.update(webDataBaseCredentialFind);
            return;
        }
        WebDataBaseCredential webDataBaseCredential = new WebDataBaseCredential(null, str3, str4, id);
        webDataBaseCredential.setId(Long.valueOf(this.credentialDao.insert(webDataBaseCredential)));
    }

    public boolean existHttpAuthCredentials() {
        return this.credentialDao.exist();
    }

    public WebDataBaseGeolocationPermissionsDao getGeolocationPermissionsDao() {
        return this.geolocationPermissionsDao;
    }
}
