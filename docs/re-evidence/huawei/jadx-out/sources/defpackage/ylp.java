package defpackage;

import android.os.ParcelFileDescriptor;
import com.huawei.wearengine.p2p.FileIdentificationParcel;
import com.huawei.wearengine.p2p.MessageParcel;
import com.huawei.wearengine.p2p.MessageParcelExtra;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes46.dex */
public class ylp {
    public static MessageParcel c(ykf ykfVar) {
        File fileD;
        if (ykfVar == null) {
            return null;
        }
        MessageParcel messageParcel = new MessageParcel();
        int iC = ykfVar.c();
        messageParcel.setType(iC);
        if (iC == 1) {
            messageParcel.setData(ykfVar.a());
            return messageParcel;
        }
        if (iC != 2 || (fileD = ykfVar.d()) == null) {
            return messageParcel;
        }
        try {
            messageParcel.setParcelFileDescriptor(ParcelFileDescriptor.open(fileD, 268435456));
            messageParcel.setFileName(fileD.getName());
            messageParcel.setDescription(ykfVar.b());
            messageParcel.setFileSha256(ylq.d(fileD));
            return messageParcel;
        } catch (FileNotFoundException unused) {
            yis.c("ConvertParcelUtil", "convertToMessageParcel FileNotFoundException");
            throw new yib(10);
        }
    }

    public static MessageParcelExtra e(ykf ykfVar, MessageParcel messageParcel) {
        if (ykfVar == null) {
            yis.c("ConvertParcelUtil", "convertToMessageParcelExtra message is null");
            return null;
        }
        if (messageParcel == null) {
            yis.c("ConvertParcelUtil", "convertToMessageParcelExtra messageParcel is null");
            return null;
        }
        MessageParcelExtra messageParcelExtra = new MessageParcelExtra();
        messageParcelExtra.setType(messageParcel.getType());
        messageParcelExtra.setData(messageParcel.getData());
        messageParcelExtra.setParcelFileDescriptor(messageParcel.getParcelFileDescriptor());
        messageParcelExtra.setFileName(messageParcel.getFileName());
        messageParcelExtra.setDescription(messageParcel.getDescription());
        messageParcelExtra.setFileSha256(messageParcel.getFileSha256());
        messageParcelExtra.setExtendJson(ymm.a(ykfVar));
        return messageParcelExtra;
    }

    public static FileIdentificationParcel e(ykd ykdVar) {
        if (ykdVar == null) {
            yis.c("ConvertParcelUtil", "convertToFileIdentificationParcel fileIdentification is null");
            return null;
        }
        FileIdentificationParcel fileIdentificationParcel = new FileIdentificationParcel();
        File fileC = ykdVar.c();
        if (fileC != null) {
            fileIdentificationParcel.setFileName(fileC.getName());
        }
        fileIdentificationParcel.setDescription(ykdVar.a());
        return fileIdentificationParcel;
    }
}
