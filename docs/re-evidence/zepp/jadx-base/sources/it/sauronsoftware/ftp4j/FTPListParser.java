package it.sauronsoftware.ftp4j;

/* JADX INFO: loaded from: classes22.dex */
public interface FTPListParser {
    FTPFile[] parse(String[] strArr) throws FTPListParseException;
}
