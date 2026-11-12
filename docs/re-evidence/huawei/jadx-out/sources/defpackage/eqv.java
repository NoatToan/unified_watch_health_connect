package defpackage;

import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.hihealth.device.open.data.MeasureRecord;
import com.huawei.hihealth.device.open.data.MeasureResult;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public class eqv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static eqv f33373b;
    private List<String> d = new ArrayList(10);
    private List<String> e = new ArrayList(10);

    public static eqv d() {
        if (f33373b == null) {
            f33373b = new eqv();
        }
        return f33373b;
    }

    public eqv() {
        this.d.add("BODY_WEIGHT");
        this.d.add("BODYFAT_RATE");
        this.e.add("BLOODPRESSURE_SYSTOLIC");
        this.e.add("BLOODPRESSURE_DIASTOLIC");
    }

    public HealthData e(MeasureResult measureResult) {
        MeasureRecord measureRecord;
        ArrayList<String> dataTypes;
        if (measureResult != null && measureResult.getRecords() != null && measureResult.getRecords().size() != 0 && (dataTypes = (measureRecord = measureResult.getRecords().get(0)).getDataTypes()) != null && !njy.e(dataTypes)) {
            if (dataTypes.containsAll(this.d) && this.d.containsAll(dataTypes)) {
                return b(measureRecord);
            }
            if (dataTypes.containsAll(this.e) && this.e.containsAll(dataTypes)) {
                return d(measureRecord);
            }
            if (a(dataTypes)) {
                enb enbVar = new enb();
                Number value = measureRecord.getValue(ObserveLabels.HEART_RATE);
                if (dataTypes.contains(ObserveLabels.HEART_RATE) && value != null) {
                    enbVar.setHeartRate(Integer.valueOf(value.intValue()));
                    return enbVar;
                }
                enbVar.setHeartRate(-1);
                return enbVar;
            }
            if (dataTypes.contains("SEQUENCE_NUMBER")) {
                return b(measureRecord, dataTypes);
            }
        }
        return null;
    }

    private dso b(MeasureRecord measureRecord) {
        dso dsoVar = new dso();
        Number value = this.d.size() >= 1 ? measureRecord.getValue(this.d.get(0)) : null;
        if (value != null) {
            dsoVar.setWeight(value.floatValue());
        }
        Number value2 = this.d.size() >= 2 ? measureRecord.getValue(this.d.get(1)) : null;
        if (value2 != null) {
            dsoVar.setBodyFatRat(value2.floatValue());
        }
        Date measureTime = measureRecord.getMeasureTime();
        if (measureTime != null) {
            dsoVar.setStartTime(measureTime.getTime());
            dsoVar.setEndTime(measureTime.getTime());
        }
        return dsoVar;
    }

    private eni d(MeasureRecord measureRecord) {
        eni eniVar = new eni();
        Number value = this.e.size() >= 1 ? measureRecord.getValue(this.e.get(0)) : null;
        if (value != null) {
            eniVar.setSystolic((short) value.floatValue());
        }
        Number value2 = this.e.size() >= 2 ? measureRecord.getValue(this.e.get(1)) : null;
        if (value2 != null) {
            eniVar.setDiastolic((short) value2.floatValue());
        }
        Date measureTime = measureRecord.getMeasureTime();
        if (measureTime != null) {
            eniVar.setStartTime(measureTime.getTime());
            eniVar.setEndTime(measureTime.getTime());
        }
        return eniVar;
    }

    private emq b(MeasureRecord measureRecord, List<String> list) {
        float fFloatValue;
        Iterator<String> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                fFloatValue = 0.0f;
                break;
            }
            String next = it.next();
            Number value = measureRecord.getValue(next);
            if (next.startsWith("BLOOD_SUGAR") && value != null) {
                fFloatValue = value.floatValue();
                break;
            }
        }
        Number value2 = measureRecord.getValue("SEQUENCE_NUMBER");
        emq emqVar = new emq();
        if (value2 != null) {
            int iIntValue = value2.intValue();
            emqVar.setBloodSugar(fFloatValue);
            Date measureTime = measureRecord.getMeasureTime();
            if (measureTime != null) {
                emqVar.setStartTime(measureTime.getTime());
                emqVar.setEndTime(measureTime.getTime());
            }
            emqVar.setSequenceNumber(iIntValue);
        }
        return emqVar;
    }

    private boolean a(List list) {
        return (list.contains(ObserveLabels.HEART_RATE) || list.contains("RRI_SQI_RESULT")) || (list.contains("ACC_RESULT") || list.contains("VOICE_PROMPTS_RESULT"));
    }
}
