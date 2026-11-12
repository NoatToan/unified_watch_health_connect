package defpackage;

import com.google.gson.Gson;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.H5GeneralTemplate;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.operation.base.BaseOperation;
import com.huawei.ui.homehealth.operation.vmall.bean.VmallResource;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class ssc extends BaseOperation<VmallResource> {
    @Override // com.huawei.ui.homehealth.operation.base.BaseOperation
    public int getPositionId() {
        return 4002;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.homehealth.operation.base.BaseOperation
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public VmallResource generateResource(Gson gson, List<ResourceBriefInfo> list) {
        for (ResourceBriefInfo resourceBriefInfo : list) {
            if (resourceBriefInfo.getContentType() == 46) {
                String content = resourceBriefInfo.getContent().getContent();
                LogUtil.a("VmallOperation", content);
                H5GeneralTemplate h5GeneralTemplate = (H5GeneralTemplate) gson.fromJson(content, H5GeneralTemplate.class);
                VmallResource vmallResource = new VmallResource(h5GeneralTemplate.getName(), h5GeneralTemplate.getNameVisibility(), h5GeneralTemplate.getLinkValue());
                vmallResource.a(System.currentTimeMillis());
                return vmallResource;
            }
        }
        return null;
    }

    @Override // com.huawei.ui.homehealth.operation.base.BaseOperation
    public String getSpCacheKey() {
        return "VMALL_RESOURCE_SP";
    }

    @Override // com.huawei.ui.homehealth.operation.base.BaseOperation
    public String getTag() {
        return "VmallOperation";
    }

    @Override // com.huawei.ui.homehealth.operation.base.BaseOperation
    public Type getResourceType() {
        return VmallResource.class;
    }
}
