package com.xiaomi.smarthome.framework.plugin.rn.nativemodule.interfaces;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes2.dex */
public interface IMIOTPersist {
    void amapScreenShot(int i, String str, Callback callback);

    void appendFile(String str, String str2, Callback callback);

    void appendFileThroughBase64(String str, String str2, Callback callback);

    void cancelDownloadFile(String str, Callback callback);

    void copyFile(ReadableMap readableMap, Callback callback);

    void createMediaWithPoints(ReadableArray readableArray, String str, String str2, ReadableMap readableMap, Callback callback);

    void cropImage(String str, String str2, ReadableMap readableMap, Callback callback);

    void dataLengthOfBase64Data(String str, Callback callback);

    void deleteAssetsFromAlbumByUrls(String str, ReadableArray readableArray, Callback callback);

    void deleteFile(String str, Callback callback);

    void deleteFontFile(ReadableMap readableMap, Callback callback);

    void downloadFile(String str, String str2, Callback callback);

    void downloadFileWithParams(String str, String str2, ReadableMap readableMap, Callback callback);

    void downloadFontFile(ReadableMap readableMap, Callback callback);

    void fetchLocalVideoFilePathFromDidAlbumByUrl(String str, String str2, Callback callback);

    void getAlbums(Callback callback);

    void getAllSourceFromPhotosDidAlbum(String str, Callback callback);

    void getAssets(String str, Callback callback);

    void getRGBAValueFromImageAtPath(String str, ReadableArray readableArray, Callback callback);

    void getStorageInfo(Callback callback);

    void isFileExists(String str, Callback callback);

    void longScreenShot(int i, String str, Callback callback);

    void mergeFiles(ReadableArray readableArray, String str, Callback callback);

    void mkdir(ReadableMap readableMap, Callback callback);

    void pdfToImage(ReadableMap readableMap, Callback callback);

    void queryFile(ReadableMap readableMap, Callback callback);

    void readFile(String str, Callback callback);

    void readFileInfo(String str, String str2, Callback callback);

    @Deprecated
    void readFileList(Callback callback);

    void readFileListFrom(String str, Callback callback);

    void readFileSegmentToBase64(String str, int i, int i2, Callback callback);

    void readFileToBase64(String str, Callback callback);

    void readFileToHexString(String str, Callback callback);

    void readFolderSize(String str, Callback callback);

    void readFontFileList(ReadableMap readableMap, Callback callback);

    void readPdfMetaData(ReadableMap readableMap, Callback callback);

    void saveFileToNotesAppOnMIUI(String str, Callback callback);

    void saveFileToPhotosAlbum(String str, Callback callback);

    void saveImageToPhotosAlbum(String str, Callback callback);

    void saveImageToPhotosDidAlbum(String str, String str2, Callback callback);

    void saveVideoToPhotosDidAlbum(String str, String str2, Callback callback);

    void screenShot(String str, Callback callback);

    void screenShotInRect(String str, ReadableMap readableMap, Callback callback);

    void subBase64DataOfBase64Data(String str, int i, int i2, Callback callback);

    void ungzFile(String str, Callback callback);

    void ungzYunMiFile(String str, Callback callback);

    void ungzipFileToString(ReadableMap readableMap, Callback callback);

    void unzipFile(String str, String str2, Callback callback);

    void uploadFile(ReadableMap readableMap, Callback callback);

    void uploadFileToFDS(ReadableMap readableMap, Callback callback);

    void uploadFileToMiCloud(ReadableMap readableMap, Callback callback);

    void writeFile(String str, String str2, Callback callback);

    void writeFileThroughBase64(String str, String str2, Callback callback);

    void writePdfFile(String str, String str2, ReadableMap readableMap, Callback callback);
}
