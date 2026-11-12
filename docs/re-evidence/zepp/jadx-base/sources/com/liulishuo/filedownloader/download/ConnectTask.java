package com.liulishuo.filedownloader.download;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.liulishuo.filedownloader.connection.FileDownloadConnection;
import com.liulishuo.filedownloader.connection.RedirectHandler;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.util.FileDownloadLog;
import com.liulishuo.filedownloader.util.FileDownloadUtils;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class ConnectTask {
    public final int a;
    public final String b;
    public final FileDownloadHeader c;
    private ConnectionProfile d;
    private String e;
    private Map<String, List<String>> f;
    private List<String> g;

    public static class b {
        private Integer a;
        private String b;
        private String c;
        private FileDownloadHeader d;
        private ConnectionProfile e;

        public ConnectTask a() {
            ConnectionProfile connectionProfile;
            Integer num = this.a;
            if (num == null || (connectionProfile = this.e) == null || this.b == null) {
                throw new IllegalArgumentException();
            }
            return new ConnectTask(connectionProfile, num.intValue(), this.b, this.c, this.d);
        }

        public b b(ConnectionProfile connectionProfile) {
            this.e = connectionProfile;
            return this;
        }

        public b c(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public b d(String str) {
            this.c = str;
            return this;
        }

        public b e(FileDownloadHeader fileDownloadHeader) {
            this.d = fileDownloadHeader;
            return this;
        }

        public b f(String str) {
            this.b = str;
            return this;
        }
    }

    public class c extends Throwable {
        public c() {
        }
    }

    private void a(FileDownloadConnection fileDownloadConnection) throws ProtocolException {
        if (fileDownloadConnection.dispatchAddResumeOffset(this.e, this.d.a)) {
            return;
        }
        if (!TextUtils.isEmpty(this.e)) {
            fileDownloadConnection.addHeader(HttpHeaders.IF_MATCH, this.e);
        }
        this.d.processProfile(fileDownloadConnection);
    }

    private void b(FileDownloadConnection fileDownloadConnection) {
        HashMap<String, List<String>> headers;
        FileDownloadHeader fileDownloadHeader = this.c;
        if (fileDownloadHeader == null || (headers = fileDownloadHeader.getHeaders()) == null) {
            return;
        }
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.v(this, "%d add outside header: %s", Integer.valueOf(this.a), headers);
        }
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (value != null) {
                Iterator<String> it2 = value.iterator();
                while (it2.hasNext()) {
                    fileDownloadConnection.addHeader(key, it2.next());
                }
            }
        }
    }

    private void d(FileDownloadConnection fileDownloadConnection) {
        FileDownloadHeader fileDownloadHeader = this.c;
        if (fileDownloadHeader == null || fileDownloadHeader.getHeaders().get("User-Agent") == null) {
            fileDownloadConnection.addHeader("User-Agent", FileDownloadUtils.defaultUserAgent());
        }
    }

    public FileDownloadConnection c() throws IllegalAccessException, IOException {
        FileDownloadConnection fileDownloadConnectionCreateConnection = CustomComponentHolder.getImpl().createConnection(this.b);
        b(fileDownloadConnectionCreateConnection);
        a(fileDownloadConnectionCreateConnection);
        d(fileDownloadConnectionCreateConnection);
        this.f = fileDownloadConnectionCreateConnection.getRequestHeaderFields();
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "<---- %s request header %s", Integer.valueOf(this.a), this.f);
        }
        fileDownloadConnectionCreateConnection.execute();
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        FileDownloadConnection fileDownloadConnectionProcess = RedirectHandler.process(this.f, fileDownloadConnectionCreateConnection, arrayList);
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.d(this, "----> %s response header %s", Integer.valueOf(this.a), fileDownloadConnectionProcess.getResponseHeaderFields());
        }
        return fileDownloadConnectionProcess;
    }

    public String e() {
        List<String> list = this.g;
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<String> list2 = this.g;
        return list2.get(list2.size() - 1);
    }

    public boolean f() {
        return this.d.b > 0;
    }

    public void g(long j) {
        ConnectionProfile connectionProfile = this.d;
        long j2 = connectionProfile.b;
        if (j == j2) {
            FileDownloadLog.w(this, "no data download, no need to update", new Object[0]);
            return;
        }
        ConnectionProfile connectionProfileBuildConnectionProfile = ConnectionProfile.ConnectionProfileBuild.buildConnectionProfile(connectionProfile.a, j, connectionProfile.c, connectionProfile.d - (j - j2));
        this.d = connectionProfileBuildConnectionProfile;
        if (FileDownloadLog.NEED_LOG) {
            FileDownloadLog.i(this, "after update profile:%s", connectionProfileBuildConnectionProfile);
        }
    }

    public ConnectionProfile getProfile() {
        return this.d;
    }

    public Map<String, List<String>> getRequestHeader() {
        return this.f;
    }

    public void retryOnConnectedWithNewParam(ConnectionProfile connectionProfile, String str) throws c {
        if (connectionProfile == null) {
            throw new IllegalArgumentException();
        }
        this.d = connectionProfile;
        this.e = str;
        throw new c();
    }

    private ConnectTask(ConnectionProfile connectionProfile, int i, String str, String str2, FileDownloadHeader fileDownloadHeader) {
        this.a = i;
        this.b = str;
        this.e = str2;
        this.c = fileDownloadHeader;
        this.d = connectionProfile;
    }
}
