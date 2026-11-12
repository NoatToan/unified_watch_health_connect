package defpackage;

import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import com.huawei.health.featuremarketing.template.ITemplateGenerator;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.openalliance.ad.constant.CreativeType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public class ewg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, ITemplateGenerator<? extends BaseTemplate>> f33552c;

    static {
        HashMap map = new HashMap();
        f33552c = map;
        map.put(20230523, new evw());
        map.put(10, new ewj());
        map.put(23, new ewj());
        map.put(78, new ewb());
        map.put(95, new ewi());
        map.put(106, new ewn());
        map.put(Integer.valueOf(CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON), new ewd());
        map.put(114, new ewh());
        map.put(134, new ewh());
        map.put(117, new ewk());
        map.put(115, new ewc());
        map.put(Integer.valueOf(AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID), new ewf());
        map.put(122, new evy());
    }

    public static BaseTemplate a(ResourceBriefInfo resourceBriefInfo) {
        int contentType = resourceBriefInfo.getContentType();
        Map<Integer, ITemplateGenerator<? extends BaseTemplate>> map = f33552c;
        ITemplateGenerator<? extends BaseTemplate> iTemplateGenerator = map.get(Integer.valueOf(contentType));
        if (iTemplateGenerator == null) {
            iTemplateGenerator = map.get(20230523);
        }
        return iTemplateGenerator.generate(resourceBriefInfo);
    }
}
