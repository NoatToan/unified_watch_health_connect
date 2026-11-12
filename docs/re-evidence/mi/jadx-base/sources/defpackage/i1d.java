package defpackage;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public interface i1d {
    Boolean assertIfFragmentParentActivityNoExtendBase();

    List<gur> getConfigList(Application application);

    String getDefaultUrlWhenEmpty();

    Boolean getDevMode(Application application);

    ConcurrentHashMap<String, String> getUrlToRNAppNameMapping();

    ConcurrentHashMap<String, String> getUrlToRNModuleMapping();

    ArrayList<String> needGaussInLargeScreenPathList(String str, String str2, String str3);

    boolean needRNPageCountControl();
}
