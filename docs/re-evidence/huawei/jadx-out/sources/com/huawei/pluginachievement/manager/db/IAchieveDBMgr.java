package com.huawei.pluginachievement.manager.db;

import defpackage.osf;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public interface IAchieveDBMgr {
    public static final String PARAM_HUID = "huid";
    public static final String PARAM_PAGE = "page";
    public static final String PARAM_PAGE_SIZE = "pageSize";
    public static final String PARAM_REPORT_NO = "reportNo";

    int delete(osf osfVar);

    long insert(osf osfVar);

    osf query(Map<String, String> map);

    List<osf> queryAll(Map<String, String> map);

    int update(osf osfVar);
}
